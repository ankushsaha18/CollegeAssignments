package ClassWork1.class_3;

class StudentDeatils {
    private String name;
    private int roll;

    public StudentDeatils() {
        super();
    }

    public StudentDeatils(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name + " " + roll;
    }

    public void display(){
        System.out.println(this.name + " " + this.roll);
    }
}
class Examination extends StudentDeatils{
    public Examination() {
        super();
    }
    public Examination(String name, int roll) {
        super(name, roll);
    }

    public void show(){
        super.display();
    }
}

public class Student {
    public static void main(String[] args) {
        Examination e = new Examination("XYZ",30);
        System.out.println(e.getName());
        System.out.println(e.getRoll());
        e.display();
        e.show();
    }
}
