package com.codewithmosh.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using JPEG");
    }
}
