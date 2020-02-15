package com.codewithmosh;

import com.codewithmosh.flyweight.PointIconFactory;
import com.codewithmosh.flyweight.PointService;

public class Main {

    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoints())
            point.draw();
    }
}
