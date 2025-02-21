package Assignment1.Q10;

public class MainEnrollApp {
    public static void main(String[] args) {
        Course ps = new Course("MTH1001","Probability and Statistics",5);
        Course ala = new Course("MTH2001","Applied Linear Algebra",3);
        Student s1 = new Student(15,"David");
        Student s2 = new Student(17,"Rohan");
        Student s3 = new Student(51,"Ankush");
        Student s4 = new Student(21,"Elyse");
        Enrollment e = new Enrollment();
        e.enrollStudent(s1,ps);
        e.enrollStudent(s2,ala);
        e.enrollStudent(s3,ala);
        e.enrollStudent(s4,ps);
        e.displayDetails(ala);
        e.displayDetails(ps);
        e.dropStudent(s3,ala);
        e.displayDetails(ala);
    }
}
