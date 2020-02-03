package com.codewithmosh;

import com.codewithmosh.iterator.BrowseHistory;

public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");

        for (var i = 0; i < history.getUrls().size(); i++) {
            System.out.println(history.getUrls().get(i));
        }
    }
}
