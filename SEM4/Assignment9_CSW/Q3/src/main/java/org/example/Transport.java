package org.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Transport {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle car = (Vehicle) context.getBean("car");
        Vehicle bike = (Vehicle) context.getBean("bike");
        car.start();
        car.stop();
        System.out.println();
        bike.start();
        bike.stop();
    }
}
