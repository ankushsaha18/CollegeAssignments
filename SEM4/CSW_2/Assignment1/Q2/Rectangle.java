package Assignment1.Q2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double perimeter(){
        return 2*(this.length + this.width);
    }
    public double area(){
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.6,20.3);
        System.out.println("Initial Details---");
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        System.out.println("Updated Details ---");
        r.setLength(20);
        r.setWidth(15);
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}
