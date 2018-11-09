package com.test1;

public class BMW extends Car {
    BMW() {
        super("BMW");
    }

    @Override
    void run() {
        System.out.println("BMW run");
    }
}
