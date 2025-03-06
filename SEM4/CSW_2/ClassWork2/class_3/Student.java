package com.collections_generics;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int roll;
    public Student(){
        super();
    }
    public Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public int compareTo(Student o){
        if(this.roll < o.roll){
            return -1;
        }else if(this.roll > o.roll){
            return 1;
        }
        return 0;
    }
}
