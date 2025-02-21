package Assignment1.Q10;

public class Course {
    private String courseCode;
    private String courseName;
    private Student[] enrolledStudents;
    private int studentCount;

    public Course(String courseCode, String courseName,int maxStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new Student[maxStudents];
        this.studentCount = 0;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public Student[] getEnrolledStudents(){
        return enrolledStudents;
    }
    public void addStudent(Student s){
        if(studentCount > enrolledStudents.length){
            System.out.println("Course size full");
        }else{
            enrolledStudents[studentCount++] = s;
            System.out.println("Student added successfully");
        }
    }
    public void removeStudent(Student s){
        for(int i = 0 ; i < studentCount ; i++){
            if(enrolledStudents[i].getStudentId() == s.getStudentId()){
                enrolledStudents[i] = enrolledStudents[studentCount-1];
                enrolledStudents[--studentCount] = null;
                System.out.println("Student removed successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
