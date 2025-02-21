package Assignment1.Q9;

public class VehicleApp {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle b = new Bicycle();
        c.accelerate();
        b.brake();
        c.accelerate(20);
        c.brake(2);
    }
}
