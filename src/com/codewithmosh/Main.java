package com.codewithmosh;

import com.codewithmosh.decorator.CloudStream;
import com.codewithmosh.decorator.EncryptedCloudStream;

public class Main {

    public static void main(String[] args) {
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("some data");
    }
}
