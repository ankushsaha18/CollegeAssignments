package Assignment1.Q1;

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Hyundai","Alcazar");
        Car myCar2 = new Car(null,null);
        System.out.println("Initial details ---");
        System.out.println("myCar1 --> " + myCar1.getMake() + ": " + myCar1.getModel());
        System.out.println("myCar2 --> " + myCar2.getMake() + ": " + myCar2.getModel());
        myCar2.setMake("Toyota");
        myCar2.setModel("Hycross");
        System.out.println("Updated details ---");
        System.out.println("myCar1 --> " + myCar1.getMake() + ": " + myCar1.getModel());
        System.out.println("myCar2 --> " + myCar2.getMake() + ": " + myCar2.getModel());
    }
}
