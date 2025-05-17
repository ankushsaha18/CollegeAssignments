package org.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s1 = (Student) context.getBean("student1");
        Student s2 = (Student) context.getBean("student2");
        s1.display();
        System.out.println("-----");
        s2.display();
    }
}