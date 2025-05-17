package org.example;


public class Student {
    private String name;
    private int rollno;
    private String email;
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void display() {
        System.out.println(name + " " + rollno + " " + email);
    }
}