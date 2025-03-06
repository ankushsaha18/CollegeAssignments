package ClassWork1.class_4;

public class MidTerm extends Student{
    private int [] midMarks;
    public MidTerm(String name, int roll,int[] marks){
        super(name,roll);
        this.midMarks= marks;
    }

    public int[] getMidmarks() {
        return midMarks;
    }

}
