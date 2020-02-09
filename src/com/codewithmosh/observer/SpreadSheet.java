package com.codewithmosh.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("SpreadSheet got updated");
    }
}
