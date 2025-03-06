package ClassWork1.class_7;

class A{
    public Object display(){
        System.out.println("Class A Display Method");
        return null;
    }
}

class B extends A{
    public String display(){ //overriding
        System.out.println("Class B Display Method");
        return null;
    }
}

public class Sample1 {
    public static void main(String[] args) {
        B b=new B();
        A a=new B();
        b.display();
        a.display();
    }
}
