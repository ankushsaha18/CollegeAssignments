package com.Ankush;


public class Student implements Comparable<Student>{
    private int roll;
    private String name;
    public Student(int roll,String name){
        super();
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Student s2 = (Student) o;
        if(this.getRoll() == s2.getRoll() && this.getName().equals(s2.getName())){
            return true;
        }
        return false;
    }

    public int compareTo(Student o){
        if(this.getRoll() < o.getRoll()){
            return -1;
        }
        if(this.getRoll() > o.getRoll()){
            return 1;
        }
        return 0;
    }
}
