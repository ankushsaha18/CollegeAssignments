package org.example;

public class Car implements Vehicle{
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println(name + " " + id + " started");
    }
    public void stop(){
        System.out.println(name + " " + id + " stopped");
    }
}
