package Assignment1.Q9;

public class Car implements Vehicle{
    public void accelerate(){
        System.out.println("Car is accelerating");
    }
    public void brake(){
        System.out.println("Car is braking");
    }
    public void accelerate(int speed){
        System.out.println("Car is accelerating with speed " + speed + " m/s");
    }
    public void brake(int duration){
        System.out.println("Car is braking in " + duration + " minutes");
    }
}
