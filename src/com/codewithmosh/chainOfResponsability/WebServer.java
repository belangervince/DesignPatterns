package com.codewithmosh.chainOfResponsability;

public class WebServer {
    public void handle(HttpRequest request) {
        // Auth
        var auth = new Authenticator();
        auth.authenticate(request);
        // Logging
        // Compression
    }
}
