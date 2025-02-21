package ClassWork.class_8.Abstraction;

public class abst1 {
    public static void main(String[] args) {
        shape r=new Rectangle();
        r.draw();
        shape c=new Circle();
        c.draw();
    }
}
abstract class shape{
    abstract void draw();
}
class Rectangle extends shape{
    @Override
    void draw() {
        System.out.println("Draw a Rectangle ");
    }
}
class Circle extends shape{
    @Override
    void draw() {
        System.out.println("Draw a Circle ");
    }
}