package Assignment2.Assignment2_1.Q5;

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

    public static void bubbleSort(Student[] students){
        for(int i = 0 ; i < students.length - 1;i++){
            for(int j = 0 ; j < students.length - i - 1 ; j++){
                if(students[j].compareTo(students[j+1]) < 0){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Student[] students = new Student[4];
        Student s1 = new Student("Ankush",51,99);
        Student s2 = new Student("David",11,88);
        Student s3 = new Student("Smith",10,80);
        Student s4 = new Student("Ashley",41,92);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        System.out.println("Before Sort ---");
        for(Student s : students){
            System.out.println(s);
        }
        bubbleSort(students);
        System.out.println("After Sort ---");
        for(Student s : students){
            System.out.println(s);
        }
    }
}
