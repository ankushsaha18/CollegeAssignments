package Assignment2.Assignment2_1.Q3;

public class CarApp {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota","White",270);
        Car c2 = new Car("Ford","Black",310);
        System.out.println("Car 1 --> " + c1);
        System.out.println("Car 2 --> " + c2);
        if(c1.compareTo(c2) > 0){
            System.out.println("Car 1 is faster");
        }else if(c1.compareTo(c2) < 0){
            System.out.println("Car 2 is faster");
        }else{
            System.out.println("Both cars have same speed");
        }
    }
}
