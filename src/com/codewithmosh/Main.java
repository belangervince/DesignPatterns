package com.codewithmosh;

import com.codewithmosh.visitor.AnchorNode;
import com.codewithmosh.visitor.HeadingNode;
import com.codewithmosh.visitor.HtmlDocument;

public class Main {

    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.highlight();
    }
}
