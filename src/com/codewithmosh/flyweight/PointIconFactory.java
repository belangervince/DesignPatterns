package com.codewithmosh.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if(!icons.containsKey(type)) {
            var icon = new PointIcon(type, null); // hospital.jpg...
            icons.put(type, icon);
        }

        return icons.get(type);
    }
}
