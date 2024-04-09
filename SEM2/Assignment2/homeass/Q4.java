package homeass;

public class Q4 {
    public static void main(String[] args) {
        Distance d1 = new Distance(5,80);
        Distance d2 = new Distance(10,125);
        System.out.println("Two Distances are -");
        d1.display();
        d2.display();
        System.out.print("Sum is: ");
        Distance d3 = d1.sum(d1,d2);
        d3.display();
    }
}
class Distance{
    int meter;
    int centimeter;
    public Distance(int meter, int centimeter) {
        this.meter = meter;
        this.meter += centimeter/100;
        this.centimeter = centimeter%100;
    }
    void display(){
        System.out.println(meter + "m " + centimeter + "cm");
    }
    Distance sum(Distance a,Distance b){
        return new Distance(a.meter + b.meter,a.centimeter + b.centimeter);
    }
}
