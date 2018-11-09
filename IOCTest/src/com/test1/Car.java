package com.test1;

public abstract class Car {
    protected String name;
    Car(String name) {
        this.name = name;
    }
    void sayName()
    {
        System.out.println("I am " + name);
    }
    abstract void run();
}
