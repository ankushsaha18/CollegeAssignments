package ClassWork.class_8.Abstraction;

abstract class Vehicle{
    abstract int getNoOfWheels();
}
class Bike1 extends Vehicle{
    public int getNoOfWheels(){
        return 2;
    }
}
class Car extends Vehicle{
    public int getNoOfWheels(){
        return 4;
    }
}
class Bus extends Vehicle{
    public int getNoOfWheels(){
        return 6;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike1();
        System.out.println(v.getNoOfWheels());
        Car v1=new Car();
        System.out.println(v1.getNoOfWheels());
        Vehicle v2=new Bus();
        System.out.println(v2.getNoOfWheels());
    }

}
