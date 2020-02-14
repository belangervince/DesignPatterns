package com.codewithmosh;

import com.codewithmosh.decorator.CloudStream;
import com.codewithmosh.decorator.CompressedCloudStream;
import com.codewithmosh.decorator.EncryptedCloudStream;
import com.codewithmosh.decorator.Stream;

public class Main {

    public static void main(String[] args) {
        storeCreditCard(
                new EncryptedCloudStream(
                        new CompressedCloudStream(
                                new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234");
    }
}
