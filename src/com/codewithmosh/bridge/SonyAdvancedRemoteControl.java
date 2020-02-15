package com.codewithmosh.bridge;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
    @Override
    public void setChannel(int number) {
        System.out.println("Sony set channel");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony turn on"); // bad approach
    }

    @Override
    public void turnOff() {
        System.out.println("Sony turn off"); // bad approach
    }
}
