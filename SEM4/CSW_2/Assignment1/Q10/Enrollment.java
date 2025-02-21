package Assignment1.Q10;

public class Enrollment implements EnrollmentSystem{
    public void enrollStudent(Student s,Course c){
        c.addStudent(s);
    }
    public void dropStudent(Student s,Course c){
        c.removeStudent(s);
    }
    public void displayDetails(Course c){
        System.out.println("Enrolled students in course " + c.getCourseName() + " are ---");
        for (Student s : c.getEnrolledStudents()){
            if(s != null){
                System.out.println("- " + s.getStudentName() + "(" + s.getStudentId() + ")");
            }
        }
    }
}
