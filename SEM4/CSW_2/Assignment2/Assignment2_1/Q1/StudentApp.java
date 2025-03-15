package Assignment2.Assignment2_1.Q1;

class Student{
    private String name;
    private Object rollNumber;
    private int age;

    public Student(String name, Object rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String toString(){
        return name + " " + rollNumber + " " + age;
    }
}
public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student("Ankush",51,19);
        Student s2 = new Student("David","8E",20);
        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);
    }
}
