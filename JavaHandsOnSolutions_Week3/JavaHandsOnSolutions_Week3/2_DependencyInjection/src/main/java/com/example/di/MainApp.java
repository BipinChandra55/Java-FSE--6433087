package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Test Constructor Injection
        Car car1 = (Car) context.getBean("carConstructor");
        car1.drive();

        // Test Setter Injection
        Car car2 = (Car) context.getBean("carSetter");
        car2.drive();
    }
}
