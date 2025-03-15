package Assignment2.Assignment2_1.Q3;

public class Car implements Comparable<Car>{
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString(){
        return model + " " + color + " " + speed;
    }

    public int compareTo(Car c){
        return Integer.compare(this.speed,c.getSpeed());
    }

}
