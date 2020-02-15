package com.codewithmosh;

import com.codewithmosh.bridge.AdvancedRemoteControl;
import com.codewithmosh.bridge.RemoteControl;
import com.codewithmosh.bridge.SamsungTV;
import com.codewithmosh.bridge.SonyTV;

public class Main {

    public static void main(String[] args) {
        //var remoteControl = new RemoteControl(new SonyTV());
        //var remoteControl = new AdvancedRemoteControl(new SonyTV());
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
