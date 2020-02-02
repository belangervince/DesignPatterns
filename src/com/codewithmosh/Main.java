package com.codewithmosh;

import com.codewithmosh.memento.Editor;
import com.codewithmosh.memento.History;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());

    }
}
