package com.codewithmosh;

import com.codewithmosh.iterator.BrowseHistory;
import com.codewithmosh.iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");

        Iterator iterator = history.createIterator();
        while(iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
