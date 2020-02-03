package com.codewithmosh;

import com.codewithmosh.command.*;
import com.codewithmosh.command.fx.Button;

public class Main {

    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
