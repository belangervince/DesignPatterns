package com.codewithmosh;

import com.codewithmosh.strategy.BlackAndWhiteFilter;
import com.codewithmosh.strategy.ImageStorage;
import com.codewithmosh.strategy.PngCompressor;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter()); // or jpeg...
        imageStorage.store("a");
    }
}
