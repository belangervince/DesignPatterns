package com.codewithmosh.chainOfResponsability;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("compress...");
        return false;
    }
}
