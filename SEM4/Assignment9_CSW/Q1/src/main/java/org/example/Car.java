package org.example;

public class Car {
    private String name;
    private String color;
    private Model model;

    public Car(String name, String color, Model model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }
    public Car(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }
}
