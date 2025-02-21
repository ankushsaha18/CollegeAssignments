package Assignment1.Q6;

public class MainApp {
    public static void main(String[] args) {
        College iter = new College("ITER","Bhubaneshwar");
        College lpu = new College("LPU","Punjab");
        Student s1 = new Student(51,"Ankush",iter);
        Student s2 = new Student(15,"Sreyansh",lpu);
        System.out.println("Student 1 Details ---");
        s1.displayStudentInfo();
        System.out.println("Student 2 Details ---");
        s2.displayStudentInfo();
    }
}
