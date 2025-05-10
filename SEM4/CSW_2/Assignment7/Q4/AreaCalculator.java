package Assignment7.Q4;

interface Shape {
    double area();
    default void printArea() {
        System.out.println("Area: " + area());
    }
}
public class AreaCalculator {
    public static void main(String[] args) {
        double radius = 5;
        Shape circle = () -> Math.PI * radius * radius;
        System.out.print("Circle -> ");
        circle.printArea();
        double side = 4;
        Shape square = () -> side * side;
        System.out.print("Square -> ");
        square.printArea();
        double length = 6;
        double width = 3;
        Shape rectangle = () -> length * width;
        System.out.print("Rectangle -> ");
        rectangle.printArea();
    }
}