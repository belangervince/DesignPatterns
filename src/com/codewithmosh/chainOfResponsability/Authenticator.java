package com.codewithmosh.chainOfResponsability;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword() == "1234");
        System.out.println("authentication..");
        return !isValid;
    }
}
