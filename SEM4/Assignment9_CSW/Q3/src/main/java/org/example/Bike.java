package org.example;

public class Bike implements Vehicle{
    private String name;
    private int id;

    public Bike(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void start(){
        System.out.println(name + " " + id + " started");
    }
    public void stop(){
        System.out.println(name + " " + id + " stopped");
    }
}
