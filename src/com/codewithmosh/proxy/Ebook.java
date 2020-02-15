package com.codewithmosh.proxy;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("loading the ebook " + this.fileName);
    }

    public void show() {
        System.out.println("showing the ebook " + this.fileName);
    }

    public String getFileName() {
        return fileName;
    }

}
