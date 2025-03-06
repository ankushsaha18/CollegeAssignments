package ClassWork1.class_8.Interface;

interface Interf3{
    static int m3(int a,int b){
        return a+b;
    }
    default void m1(){
        m2();
        System.out.println("Default method");
    }
    private void m2(){
        System.out.println("private method");
    }
}

public class Main2 implements Interf3{
    public static void main(String[] args) {
        Main2 m=new Main2();
        m.m1();
        System.out.println(Interf3.m3(10,20));
    }
}
