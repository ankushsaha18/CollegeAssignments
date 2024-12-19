import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int,float,double and boolean:");
        String i = sc.next();
        String f = sc.next();
        String d = sc.next();
        String b = sc.next();
        Integer obji = Integer.valueOf(i);
        Float objf = Float.valueOf(f);
        Double objd = Double.valueOf(d);
        Boolean objb = Boolean.valueOf(b);
    }
}
