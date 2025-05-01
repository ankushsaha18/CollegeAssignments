package MidSem2024.Q1;

interface shape{
    void area();
    void perimeter();
}
class Circle implements shape{
    public void area(){
        System.out.println("Default area of circle");
    }
    public void perimeter(){
        System.out.println("Default perimeter of circle");
    }
    public void area(int r){
        System.out.println("Area = " + (Math.PI*r*r));
    }
    public void perimeter(int r){
        System.out.println("Perimeter = " + (2*Math.PI*r));
    }
}
class Rectangle implements shape{
    public void area(){
        System.out.println("Area of Rectangle");
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle");
    }
    public void area(int l,int b){
        System.out.println("Area = " + (l*b));
    }
    public void perimeter(int l,int b){
        System.out.println("Perimeter = " + (2*(l+b)));
    }
}
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area();
        c.perimeter();
        c.area(20);
        c.perimeter(10);
        r.area();
        r.perimeter();
        r.area(2,5);
        r.perimeter(3,6);
    }
}
