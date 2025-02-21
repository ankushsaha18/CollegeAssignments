package ClassWork.class_4;

public class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        super();
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return name + " " + roll;
    }

}
