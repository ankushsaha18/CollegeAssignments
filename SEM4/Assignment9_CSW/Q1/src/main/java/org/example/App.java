package org.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car c = (Car)a.getBean("car");
        System.out.println(c.getName());
        System.out.println(c.getColor());
        System.out.println(c.getModel());
    }
}