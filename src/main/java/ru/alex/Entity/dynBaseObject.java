package ru.alex.Entity;

import java.util.LinkedHashMap;

public interface dynBaseObject {
    LinkedHashMap<String,Double> visibleColumnsOrder ();
    String getObjectType ();
    String getHQL();
}
