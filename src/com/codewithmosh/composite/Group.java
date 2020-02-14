package com.codewithmosh.composite;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> objects = new ArrayList<>();

    public void add(Object shape) {
        objects.add(shape);
    }

    public void render() {
        for (var shape : objects) {
            if (shape instanceof Shape)
                ((Shape)shape).render();
            else
                ((Group)shape).render();
        }
    }
}
