package ru.alex.Entity.MedUni.Complex;

import ru.alex.Entity.dynBaseObject;

import java.util.Date;
import java.util.LinkedHashMap;

public class Subs implements dynBaseObject {
    private Integer id;
    private String name;
    private Date timeOf;
    private Integer active;

    public Subs() {}

    public Subs(Integer id, String name, Date timeOf, Integer active) {
        this.id = id;
        this.name = name;
        this.timeOf = timeOf;
        this.active = active;
    }

    public static LinkedHashMap<String, Double> visibleColumnsOrder() {
        LinkedHashMap<String,Double> visibleColumns = new LinkedHashMap<>();
        visibleColumns.put("id",100.0);
        visibleColumns.put("name",0.0); //max size
        visibleColumns.put("timeOf",0.0);
        visibleColumns.put("active",100.0);
        return visibleColumns;
    }

    public static String getObjectType() { return "complex"; }

    public static  String getHQL() {
        StringBuilder query = new StringBuilder();
        query.append(getSelectPart() + getWherePart() + getGroupPart() + getOrderPart());
        return query.toString();
    }

    private static String getSelectPart() {
        return "Select new ru.alex.Entity.MedUni.Complex.Subs (list.id ,list.name,ver.timeOf,list.isActive) " +
                "from SubsList list " +
                "INNER JOIN SubsVer ver  on ver.subsId =list.id and list.version = ver.version " ;
    }

    private static String getWherePart() {
        return  "where ver.typeOf = 0 ";
    }

    private static String getGroupPart() {
        return " ";
    }

    private static String getOrderPart() {
        return "order by 1";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeOf() {
        return timeOf;
    }

    public void setTimeOf(Date timeOf) {
        this.timeOf = timeOf;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subs subs = (Subs) o;

        if (id != null ? !id.equals(subs.id) : subs.id != null) return false;
        if (name != null ? !name.equals(subs.name) : subs.name != null) return false;
        if (timeOf != null ? !timeOf.equals(subs.timeOf) : subs.timeOf != null) return false;
        return active != null ? active.equals(subs.active) : subs.active == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (timeOf != null ? timeOf.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        return result;
    }
}
