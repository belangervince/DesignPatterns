package com.codewithmosh;

import com.codewithmosh.facade.NotificationService;

public class Main {

    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("hello world", "target");
    }
}
