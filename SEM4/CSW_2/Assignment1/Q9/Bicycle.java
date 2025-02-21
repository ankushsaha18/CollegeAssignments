package Assignment1.Q9;

public class Bicycle implements Vehicle{
    public void accelerate(){
        System.out.println("Bicycle is accelerating");
    }
    public void brake(){
        System.out.println("Bicycle is braking");
    }
    public void accelerate(int speed){
        System.out.println("Bicycle is accelerating with speed " + speed + " m/s");
    }
    public void brake(int duration){
        System.out.println("Bicycle is braking in " + duration + " minutes");
    }
}
