package ClassWork.class_2;

public class StudentLibrary {
    private Student[] students;
    private int count;

    public StudentLibrary() {
        super();
    }

    public StudentLibrary(int size) {
        this.students = new Student[size];
        this.count = 0;
    }

    public void addStudent(Student s){
        if (this.count < this.students.length){
            this.students[this.count++] = s;
            System.out.println("Student added");
        }else{
            System.out.println("Seats are full");
        }
    }

    public void display(){
        for (int i = 0 ; i < this.count ; i++){
            System.out.println(this.students[i]);
        }
        if(this.count == 0){
            System.out.println("No Student");
        }
    }

    public Student search(int roll){
        for (int i = 0 ; i < this.count ; i++){
            if(this.students[i].getRoll() == roll){
                System.out.println("Student found -> " + this.students[i]);
                return this.students[i];
            }
        }
        System.out.println("Student not found");
        return null;
    }
}
