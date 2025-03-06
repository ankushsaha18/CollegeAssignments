package ClassWork1.class_1;

public class Employee {
    private String eName;
    private int eID;
    private String eDesignation;
    private double eSalary;

    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteID() {
        return eID;
    }
    public void seteID(int eID) {
        this.eID = eID;
    }

    public String geteDesignation() {
        return eDesignation;
    }
    public void seteDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public double geteSalary() {
        return eSalary;
    }
    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public String toString(){
        return this.eName + " " + this.eID + " " + this.eDesignation + " " + eSalary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.seteName("Ankush");
        e.seteID(487);
        e.seteDesignation("SDE");
        e.seteSalary(100000);
        System.out.println(e);
    }
}
