package homeass;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        CircleType obj = new CircleType(2.2,1.5,5.7);
        obj.printCoordinate();
        obj.printArea();
        obj.printCircumference();
        obj.printRadius();
    }
}
class PointType{
    double x;
    double y;
    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void printCoordinate(){
        System.out.println("Point is: (" + x + "," + y + ")");
    }
    void setCoordinate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y coordinates respectively: ");
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
}
class CircleType extends PointType{
    double radius;
    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    void setRadius(){
        System.out.print("Enter radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        this.radius = sc.nextDouble();
    }
    void printRadius(){
        System.out.println("Radius is: " + this.radius);
    }
    double getRadius(){
        return this.radius;
    }
    void printArea(){
        System.out.println("Area is: " + (Math.PI * this.radius * this.radius));
    }
    void printCircumference(){
        System.out.println("Circumference is: " + (2 * Math.PI * this.radius));
    }
}
