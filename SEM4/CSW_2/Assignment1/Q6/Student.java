package Assignment1.Q6;

public class Student {
    private int studentID;
    private String studentName;
    private College college;

    public Student(int studentID, String studentName, College college) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo(){
        System.out.println(this.studentID + " " + this.studentName + " " +
                college.getCollegeName() + " " + college.getCollegeLoc());
    }
}
