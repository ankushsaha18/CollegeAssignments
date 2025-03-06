package ClassWork1.class_4;

public class EndTerm extends MidTerm{
    private int total;
    private double avg;
    private int [] endMarks;

    public EndTerm(String name, int roll, int[] marks, int[] marks1) {
        super(name, roll, marks);
        this.endMarks = marks1;
    }

    public int[] getEndmarks() {
        return endMarks;
    }

    public void calculate(){
        this.total= 0;
        for(int i=0;i< endMarks.length;i++){
            this.total += endMarks[i]+getMidmarks()[i];
        }
        System.out.println("Total Mark :" + this.total);
        this.avg = (double) this.total/endMarks.length;
        System.out.println("Average :" + this.avg);
    }
}
