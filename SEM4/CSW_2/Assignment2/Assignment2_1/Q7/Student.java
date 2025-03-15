package Assignment2.Assignment2_1.Q7;

import java.util.Arrays;

public class Student {
    private String name;
    private int rollNumber;
    private int age;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return name + " " + rollNumber + " " + age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ankush",51,19);
        Student s2 = new Student("David",11,21);
        Student s3 = new Student("Smith",10,18);
        Student s4 = new Student("Ashley",44,20);
        Student[] students = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        System.out.println("Before sorting ---");
        for(Student s : students){
            System.out.println(s);
        }
        System.out.println("Sorting based on roll number ---");
        Arrays.sort(students,new RollComparator());
        for(Student s : students){
            System.out.println(s);
        }
        System.out.println("Sorting based on age ---");
        Arrays.sort(students,new AgeComparator());
        for(Student s : students){
            System.out.println(s);
        }
    }
}
