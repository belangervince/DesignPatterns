package com.codewithmosh.flyweight;

public class Point { // scenario : uses too much memory and crashes
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
    }
}
