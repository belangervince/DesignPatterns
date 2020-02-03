package com.codewithmosh;

import com.codewithmosh.command.editor.*;

public class Main {

    public static void main(String[] args) {
        var history = new History();
        var doc = new HtmlDocument();
        doc.setContent("Hello World");

        var boldCommand = new BoldCommand(doc, history);
        boldCommand.execute();
        System.out.println(doc.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(doc.getContent());
    }
}
