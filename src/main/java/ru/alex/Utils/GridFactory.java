package ru.alex.Utils;

import com.vaadin.event.ShortcutAction;
import com.vaadin.event.ShortcutListener;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.TextField;
import com.vaadin.ui.components.grid.HeaderCell;
import com.vaadin.ui.components.grid.HeaderRow;
import org.hibernate.Session;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GridFactory {
    Grid<?> grid;

    public GridFactory(Session session, Class someClass, String parentId, boolean gridColReordering) {
        grid = new Grid(someClass);
        grid.setItems(askBase(session,someClass,parentId,null));
        setGridColums(grid,getVisibleColumns(someClass),gridColReordering);
        addGridFilters(session,someClass,grid);
        grid.setId(someClass.getSimpleName()+":"+parentId);
    }

    private List askBase(Session session, Class someClass,String parentId, HashMap<String,String> filters) {

        //Базовый текст запроса
        StringBuilder query = new StringBuilder();
        try {
            Method getHql = someClass.getMethod("getHQL",null);
            query.append(getHql.invoke(null).toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //Todo Система фильтрации
        //Если заданны фильтры
        //{}

        return session.createQuery(query.toString()).getResultList();
    }

    private void setGridColums(Grid<?> grid, LinkedHashMap<String, Double> visibleColumns, boolean gridColReordering) {
        if (visibleColumns!=null ) {
            //видимость и ширина колонок
            for (Grid.Column col : grid.getColumns()) {
                if (!visibleColumns.containsKey(col.getId())) {
                    col.setHidden(true);
                } else {
                    if (visibleColumns.get(col.getId()) == 0.0) {
                        col.setWidthUndefined();
                    } else {
                        col.setWidth(visibleColumns.get(col.getId()));
                    }
                }
            }

            //Порядок
            String[] colOrder = new String[visibleColumns.size()];
            Integer i = 0;
            for (Map.Entry<String,Double> entry : visibleColumns.entrySet()) {
                colOrder[i] = entry.getKey();
                i++;
            }
            grid.setColumnOrder(colOrder);
        }

        //Разрешить пользователю выбор и упорядочивание колонк
        grid.getColumns().stream().forEach(column -> column.setHidable(gridColReordering));
        grid.setColumnReorderingAllowed(gridColReordering);
    }

    private LinkedHashMap<String, Double> getVisibleColumns(Class someClass) {
        try{
            Method method = someClass.getMethod("visibleColumnsOrder",null);
            return (LinkedHashMap<String,Double>) method.invoke(null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void addGridFilters(Session session, Class someClass, Grid<?> grid) {
        HeaderRow filterRow = grid.appendHeaderRow();
        for (Grid.Column col : grid.getColumns()) {
            HeaderCell cell = filterRow.getCell(col);
            TextField filter = new TextField();
            filter.setSizeFull();
            filter.setCaption(col.getId());
            filter.addShortcutListener(new ShortcutListener(someClass.getName() + "header enter key ", ShortcutAction.KeyCode.ENTER,null) {
                @Override
                public void handleAction(Object o, Object o1) {
                    //Заполняем карту фильтров
                    HashMap<String,String> filters = new HashMap<>();
                    for (Component tmp : filterRow.getComponents()) {
                        TextField textField = (TextField) tmp;
                        if (textField.getValue().length()>0) filters.put(textField.getCaption(),textField.getValue());
                    }

                    //По иду таблицы узнаем является ли она дочерней.
                    String parentId = grid.getId().substring(grid.getId().indexOf(':')+1);
                    if (parentId.equals("null")) {
                        askBase(session,someClass,null,filters);
                    } else {
                        askBase(session,someClass,parentId,filters);
                    }
                }
            });
            cell.setComponent(filter);

        }
    }

    public Grid<?> getGrid() {
        return grid;
    }
}
