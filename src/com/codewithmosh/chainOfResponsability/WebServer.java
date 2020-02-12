package com.codewithmosh.chainOfResponsability;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler; // null check...
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
