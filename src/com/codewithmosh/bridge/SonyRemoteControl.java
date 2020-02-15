package com.codewithmosh.bridge;

public class SonyRemoteControl extends RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("sony turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("sony turn off");
    }
}
