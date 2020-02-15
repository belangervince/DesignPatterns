package com.codewithmosh;

import com.codewithmosh.proxy.Ebook;
import com.codewithmosh.proxy.Library;

public class Main {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName : fileNames)
            library.add(new Ebook(fileName));

        library.openEbook("a"); // loads all books = problem
    }
}
