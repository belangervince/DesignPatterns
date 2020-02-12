package com.codewithmosh.chainOfResponsability;

public class Logger extends Handler {

    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("logged...");
        return false;
    }
}
