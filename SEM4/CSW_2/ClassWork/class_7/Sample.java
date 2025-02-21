package ClassWork.class_7;

public class Sample {
    public void m1(){
        System.out.println("No Arg in m1 method");
    }
    public void m1(int a){
        System.out.println("One Arg in m1 method");
    }

    public static void main(String[] args) {
        Sample s=new Sample();
        s.m1();
        s.m1(10);
    }
}
