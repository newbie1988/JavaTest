package com.test1;

public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("Dog");
    }
    @Override
    public String toString() {
        return "I am a dog";
    }
}
