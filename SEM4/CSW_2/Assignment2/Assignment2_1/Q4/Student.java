package Assignment2.Assignment2_1.Q4;

public class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Student(String name, int rollNumber, double totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + " " + rollNumber + " " + totalMark;
    }

    public int compareTo(Student s){
        return Double.compare(this.totalMark,s.totalMark);
    }

    public static Student search(Student[] sarr, int roll){
        for(Student s : sarr){
            if(s.rollNumber == roll){
                System.out.println("Student found !!");
                return s;
            }
        }
        System.out.println("Student not found !!");
        return null;
    }


    public static void main(String[] args) {
        Student[] students = new Student[4];
        Student s1 = new Student("Ankush",51,99);
        Student s2 = new Student("David",11,92);
        Student s3 = new Student("Smith",10,88);
        Student s4 = new Student("Ashley",41,85);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        if(s1.compareTo(s2) > 0){
            System.out.println(s1.getName() + " has more marks");
        }else if(s1.compareTo(s2) < 0){
            System.out.println(s2.getName() + " has more marks");
        }else{
            System.out.println("Both have equal marks");
        }
        System.out.println(search(students,10));
    }
}
