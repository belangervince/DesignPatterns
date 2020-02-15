package com.codewithmosh;

import com.codewithmosh.flyweight.PointService;

public class Main {

    public static void main(String[] args) {
        var service = new PointService();
        for (var point : service.getPoints())
            point.draw();
    }
}
