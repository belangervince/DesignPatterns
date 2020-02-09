package com.codewithmosh.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got updated " + value);
    }
}
