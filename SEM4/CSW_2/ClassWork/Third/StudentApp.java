package com.second;

public class StudentApp {
    public static void main(String[] args) {
        StudentLibrary sl = new StudentLibrary(10);
        sl.addStudent(new Student("Ankush",51,"CSE"));
        sl.addStudent(new Student("Rahul",88,"CSE"));
        sl.addStudent(new Student("Vivek",25,"ECE"));
        sl.display();
        sl.search(88);
    }
}
