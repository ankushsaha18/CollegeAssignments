package ClassWork.class_4;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        int [] midMark={30,30,29,29,27};
        MidTerm m = new MidTerm("Ankush",51,midMark);
        System.out.println(m);
        System.out.println(Arrays.toString(m.getMidmarks()));
        int [] endMark={60,60,58,57,55};
        EndTerm e = new EndTerm("Ankush",51,midMark,endMark);
        System.out.println(e);
        System.out.println(Arrays.toString(e.getMidmarks()));
        System.out.println(Arrays.toString(e.getEndmarks()));
        e.calculate();
    }
}
