package homeass;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter angle in radian:");
        double x = sc.nextDouble();
        double result = computeSin(x);
        System.out.println("sin(" + x + ") = " + result);
    }

    public static double computeSin(double x) {
        double term = x;
        double sum = term;
        int n = 1;
        do {
            n += 2;
            term *= -(x * x) / (n * (n - 1));
            sum += term;
        } while (Math.abs(term) > .000001);

        return sum;
    }
}

