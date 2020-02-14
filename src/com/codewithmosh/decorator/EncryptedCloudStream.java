package com.codewithmosh.decorator;

public class EncryptedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data) {
        return "#$@#$@#$@#$"; // example
    }
}
