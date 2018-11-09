package com.test1;

public class Greeter {
    private String message;
    private String name;
    public Greeter() {
        message = "Hello";
        name = "Mike";
    }
    public Greeter(String message) {
        this.message = message;
        name = "Mike";
    }
    public Greeter(String message, String name) {
        this.message = message;
        this.name = name;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void say() {
        System.out.println(message + ", " + name);
    }
}
