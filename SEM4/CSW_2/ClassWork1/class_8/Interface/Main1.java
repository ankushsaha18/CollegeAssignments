package ClassWork1.class_8.Interface;

interface Interf1{
    void show1();
}

interface Interf2{
    void show1();
}

class ServiceProvider1 implements Interf1,Interf2{
    @Override
    public void show1() {
        System.out.println("Show 1 in both");
    }

}

public class Main1 {
    public static void main(String[] args) {
        ServiceProvider1 s=new ServiceProvider1();
        s.show1();
    }
}
