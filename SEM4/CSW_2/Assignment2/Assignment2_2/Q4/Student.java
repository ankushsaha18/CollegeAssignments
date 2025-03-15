package Assignment2.Assignment2_2.Q4;

import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }

    public String toString(){
        return name + " " + age + " " + mark;
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || o.getClass() != this.getClass()){
            return false;
        }
        Student s = (Student) o;
        if((this.name.equals(s.name)) && (this.age == s.age) && (this.mark == s.mark)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("Ankush",19,99));
        list.add(new Student("David",20,85));
        list.add(new Student("Smith",21,90));
        System.out.println("List of Students ---");
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student to search: ");
        String name = sc.next();
        int age = sc.nextInt();
        double mark = sc.nextDouble();
        if(list.contains(new Student(name,age,mark))){
            System.out.println("Student found !!");
        }else{
            System.out.println("Student not found !!");
        }
        System.out.print("Enter Student to remove: ");
        name = sc.next();
        age = sc.nextInt();
        mark = sc.nextDouble();
        list.remove(new Student(name,age,mark));
        System.out.println("List after removing student ---");
        System.out.println(list);
        System.out.println("Total students in list ---");
        System.out.println(list.size());
        Student s = new Student("Ankush",19,99);
        if(s.equals(list)){
            System.out.println("Students are same");
        }else{
            System.out.println("Students are different");
        }
    }
}
