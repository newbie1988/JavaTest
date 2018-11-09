package com.test1;

public class Benz extends Car {
    Benz() {
        super("Benz");
    }

    @Override
    void run() {
        System.out.println("Benz run");
    }
}
