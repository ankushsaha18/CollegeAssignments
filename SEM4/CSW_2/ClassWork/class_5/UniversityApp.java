package ClassWork.class_5;

public class UniversityApp {
    public static void main(String[] args) {
        University d=new University("SOA",5);
        d.addDepartment("ITER");
        d.addDepartment("SUM");
        d.addDepartment("IDS");
        d.display();
    }
}
