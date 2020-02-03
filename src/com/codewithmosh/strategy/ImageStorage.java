package com.codewithmosh.strategy;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // JPEG, PNG...
        // Filters...
        if (compressor == "jpeg")
            System.out.println("Compressing using JPEG");
        else if (compressor == "png")
            System.out.println("Compressing using PNG");

        if (filter == "b&w")
            System.out.println("applying black and white filter");
        else if (filter == "high contrast")
            System.out.println("Applying high contrast filter");
    }
}
