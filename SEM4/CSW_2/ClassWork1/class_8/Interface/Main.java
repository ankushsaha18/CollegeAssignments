package ClassWork1.class_8.Interface;

interface Interf{
    void show1();
    void show2();
}

abstract class ServiceProvider implements Interf{
    @Override
    public void show1() {
        System.out.println("Show 1 Method");
    }
}

class SubServiceProvider extends ServiceProvider{
    @Override
    public void show2() {
        System.out.println("Show 2 Method");
    }
}

public class Main {
    public static void main(String[] args) {
        SubServiceProvider s = new SubServiceProvider();
        s.show1();
        s.show2();
    }
}
