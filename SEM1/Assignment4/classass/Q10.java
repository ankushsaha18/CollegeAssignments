package classass;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N:");
        int N = sc.nextInt();
        int power = 1;
        while (power *3<= N) {
            power *= 3;
        }
        System.out.println("The largest power of three less than or equal to " + N + " is: " + power);
        }
}