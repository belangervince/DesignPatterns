package com.codewithmosh.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void highlight() {
        for(var n : nodes)
            n.highlight();
    }
}
