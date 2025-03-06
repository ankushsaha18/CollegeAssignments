package ClassWork1.class_8.Abstraction;

public class abst3 {
    public static void main(String[] args) {
        Bike b = new Yamaha();
        b.run();
        b.changegear();
    }
}
abstract class Bike{
    Bike(){
        System.out.println("Bike Created ");
    }
    abstract void run();
    void changegear(){
        System.out.println("Gear Changed ");
    }
}
class Yamaha extends Bike{
    void run(){
        System.out.println("Runing Safely ");
    }
}

