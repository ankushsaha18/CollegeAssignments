package ClassWork1.class_8.Abstraction;

public class abst2 {
    public static void main(String[] args) {
        Bank2 s = new SBI();
        System.out.println(s.getROI());
        Bank2 p = new PNB();
        System.out.println(p.getROI());
    }
}
abstract class Bank2{
    abstract int getROI();
}
class SBI extends Bank2{
    int getROI(){
        return 7;
    }
}
class PNB extends Bank2{
    int getROI(){
        return 8;
    }
}
