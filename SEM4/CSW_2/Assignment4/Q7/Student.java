package Assignment4.Q7;

public class Student {
    private String studentName; private String courseName;
    public Student(String studentName, String courseName) {
        this.studentName = studentName; this.courseName = courseName;
    }
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName + ", Course Name: " +
                courseName);
    }
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for student: " +
                studentName);
        super.finalize();
    }
    private static void displayMemoryUsage(String message, Runtime runtime) {
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println(message);
        System.out.println("Total Memory: " + totalMemory + " | Free Memory: " +
                freeMemory + " | Used Memory: " + usedMemory);
    }
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        displayMemoryUsage("Initial Memory Status:", runtime);
        Student student1 = new Student("Anindya", "Physics");
        Student student2 = new Student("Sayan", "Mathematics");
        System.out.println("\nStudent 1 Details:");
        student1.displayStudentDetails();
        System.out.println("Student 2 Details:");
        student2.displayStudentDetails();
        displayMemoryUsage("\nMemory Status After Object Creation:", runtime);
        student1 = null; student2 = null;
        System.gc();
        displayMemoryUsage("\nMemory Status After Garbage Collection:",
                runtime);
    }
}
