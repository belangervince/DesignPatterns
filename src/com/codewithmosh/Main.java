package com.codewithmosh;

import com.codewithmosh.command.AddCustomerCommand;
import com.codewithmosh.command.CustomerService;
import com.codewithmosh.command.fx.Button;

public class Main {

    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
