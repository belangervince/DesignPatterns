package com.codewithmosh.facade;

public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
