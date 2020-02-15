package com.codewithmosh.proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("loading the ebook " + this.fileName);
    }

    @Override
    public void show() {
        System.out.println("showing the ebook " + this.fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }

}
