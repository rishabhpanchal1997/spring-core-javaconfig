package com.app;

import com.configuration.BeanConfiguration;
import com.engine.Engine;
import com.vehicle.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome to Spring Core Java based configuration !\n");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // When using xml file, we get application context by :
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")

        // Access by type -> class type Car
        System.out.println("Access bean by type :");
        Car car = context.getBean(Car.class);
        car.carStart();

        // Access car bean by custom name
        System.out.println("\nAccess bean by custom name :");
        Car car2 = (Car) context.getBean("myCarBean");
        car2.carStart();

        System.out.println("\nAccess bean by type and name :");
        // Access name and type -> default name created by Bean and type
        Engine pengine = context.getBean("petrolEngine", Engine.class);
        pengine.start();

        Engine dengine = (Engine) context.getBean("dieselEngine");
        dengine.start();
    }
}