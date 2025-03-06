package ClassWork2.class_1;

public class Student {
    private String name;
    private int roll;
    private String branch;
    public Student(String name, int roll, String branch) {
        super();
        this.name = name;
        this.roll = roll;
        this.branch = branch;
    }
    public String toString() {
        return  name + " " + roll + " " + branch + " ";
    }

    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public String getBranch() {
        return branch;
    }
}
