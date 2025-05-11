package ClassWork7;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;

class Student{
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Supplier<Student> s = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student details: ");
            return new Student(sc.nextInt(),sc.next(),sc.nextInt());
        };
        list.add(s.get());
        list.add(s.get());
        list.add(s.get());
        Predicate<Student> p = stud -> stud.getMarks() >= 60;
        Predicate<Student> p1 = stud -> stud.getMarks() >= 50;
        Predicate<Student> p2 = stud -> stud.getMarks() >= 40;
        Function<Student,String> f = stud -> {
            if(p.test(stud)) {
                return "first division";
            }
            if(p1.test(stud)) {
                return "second division";
            }
            if(p2.test(stud)) {
                return "third division";
            }
            return "failed";
        };
        Consumer<Student> c = stud ->{
            System.out.println(stud.getName() + " has secured " + f.apply(stud));
        };
        for(Student stud : list) {
            c.accept(stud);
        }
    }
}
