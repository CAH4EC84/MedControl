package ru.alex.Views;

import com.vaadin.navigator.View;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import org.hibernate.Session;
import ru.alex.Entity.MedUni.Complex.Subs;
import ru.alex.Utils.GridFactory;

public class SubscriptionPage extends VerticalLayout implements View {
    public SubscriptionPage(Session session) {
        addComponent(new Label("Subs Page"));

        Grid<?> parentGrid = new GridFactory(session,Subs.class,null,true).getGrid();
        parentGrid.addItemClickListener(itemClick -> {
            Subs item = (Subs) itemClick.getItem();
            System.out.println(item.getName());
        });

        parentGrid.setSizeFull();
        addComponent(parentGrid);



  //      TabSheet details = new TabSheet();

//        Grid<?> childGrid = new GridFactory(session,SubsDetails.class,"10", true).getGrid();


    }
}
