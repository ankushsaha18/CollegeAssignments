package classass;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

}
