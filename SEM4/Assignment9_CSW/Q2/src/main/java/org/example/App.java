package org.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sim sim1 = (Sim) context.getBean("sim1");
        Sim sim2 = (Sim) context.getBean("sim2");
        System.out.println("Using Voda SIM:");
        sim1.calling();
        sim1.data();
        System.out.println("-----");
        System.out.println("Using Airtel SIM:");
        sim2.calling();
        sim2.data();
    }
}
