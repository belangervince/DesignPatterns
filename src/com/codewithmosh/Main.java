package com.codewithmosh;

import com.codewithmosh.state.BrushTool;
import com.codewithmosh.state.Canvas;

public class Main {

    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
