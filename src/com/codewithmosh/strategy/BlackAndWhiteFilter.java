package com.codewithmosh.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Apply black and white filter");
    }
}
