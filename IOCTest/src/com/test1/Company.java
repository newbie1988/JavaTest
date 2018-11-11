package com.test1;

public class Company {
    private Person person;
    private BMW car;
    public Company(Person person, BMW car) {
        System.out.println("111111111");
        this.person = person;
        this.car = car;
    }

    @Override
    public String toString() {
        person.introduce();
        car.sayName();
        return super.toString();
    }
}
