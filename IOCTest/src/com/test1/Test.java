package com.test1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
//        ApplicationContext acx = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = acx.getBean("Person", Person.class);
//        Person person1 = acx.getBean("Person", Person.class);
//        person1.setAge(21);
//        person1.introduce();
//        person.introduce();
//
//        BeanFactory bean = new ClassPathXmlApplicationContext("bean.xml");
//        Greeter greeter = bean.getBean("Greeter", Greeter.class);
//        greeter.say();
//        Greeter greeter1 = bean.getBean("Greeter1", Greeter.class);
//        greeter1.say();
//        Greeter greeter2 = bean.getBean("Greeter2", Greeter.class);
//        greeter2.say();
//        Greeter greeter3 = bean.getBean("Greeter3", Greeter.class);
//        greeter3.say();
//
//        Car bmw = bean.getBean("BMWFactory", Car.class);
//        bmw.run();
//        Car benz = bean.getBean("BenzFactory", Car.class);
//        benz.run();
//
//        System.out.println("------------list---------------");
//        NameLists names = bean.getBean("Names", NameLists.class);
//        names.print();
//
//        System.out.println("------------map----------------");
//        Capitals capitals = bean.getBean("Capitals", Capitals.class);
//        capitals.print();
//
//        System.out.println("-----------object-------------");
//        Company company = bean.getBean("Company", Company.class);
//        System.out.println(company);

        System.out.println("---------parent and child--------");
        ApplicationContext parent = new ClassPathXmlApplicationContext("parent.xml");
        ApplicationContext child = new ClassPathXmlApplicationContext(new String[]{"bean.xml"}, parent);
        Company localCompany = child.getBean("FamilyCom1", Company.class);
        System.out.println(localCompany);
//        Company parentCompany = child.getBean("FamilyCom2", Company.class);
//        System.out.println(parentCompany);
    }
}
