package ClassWork4;

import java.lang.ref.Cleaner;

class Student{
    private int roll;
    private String name;
    private static final Cleaner cleaner = Cleaner.create();
    public final Cleaner.Cleanable cleanable;

    public Student(int roll,String name) {
        this.name = name;
        this.roll = roll;
        this.cleanable = cleaner.register(this,new MyCleaner((this)));
    }
    @Override
    public String toString(){
        return roll + " " + name;
    }
}
class MyCleaner implements Runnable{
    private Student s;
    public MyCleaner(Student s) {
        this.s = s;
    }
    @Override
    public void run(){
        System.out.println("Object is being cleaned " + s);
    }
}
public class CleanerObject {
    public static void main(String[] args) {
        Student s = new Student(51,"Ankush");
        s.cleanable.clean();
        System.out.println("End of Main");
    }
}
