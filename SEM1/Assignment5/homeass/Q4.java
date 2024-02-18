package homeass;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter angle in radian:");
        double x = sc.nextDouble();
        double result = computeCos(x);
        System.out.println("cos(" + x + ") = " + result);
    }

    public static double computeCos(double x) {
        double term = 1;
        double sum = term;
        int n = 0;
        do {
            n += 2;
            int fact=factorial(n);
            term *= -(x * x) / fact;
            sum += term;
        } while (Math.abs(term) > .000001);

        return sum;
    }
    public static int factorial(int n) {
    	int fact=1;
    	for(int i=2;i<=n;i++) {
    		fact*=i;
    	}
    	return fact;
    }
}