package classass;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two positive integers:");
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        System.out.print("The GCD of " + x + " and " + y + " is: " );
			while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
		System.out.println(x);
	}
}
