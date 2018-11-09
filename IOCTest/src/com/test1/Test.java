package com.test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext acx = new ClassPathXmlApplicationContext("bean.xml");
        Person person = acx.getBean("Person", Person.class);
//        person.introduce();
        Person person1 = acx.getBean("Person", Person.class);
        person1.setAge(21);
        person1.introduce();
        person.introduce();
    }
}
