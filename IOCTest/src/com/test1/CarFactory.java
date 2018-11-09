package com.test1;

public class CarFactory {
    public static Car create(String name) {
        if(name.equals("BMW")) {
            return new BMW();
        } else if(name.equals("Benz")) {
            return new Benz();
        }
        return new Benz();
    }
}
