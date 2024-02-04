package classass;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int N = sc.nextInt();
        int sum = 0;
        String stm = "(";
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                sum += i;
                stm += i + "+";

            }
        }
        boolean isPerfect = (sum == N);
        System.out.println(stm.substring(0, stm.length() - 1) + ")=" + sum);
        if (isPerfect) {
            System.out.println(N + " is a perfect number.");
        } else { // if N is not perfect
            System.out.println(N + " is not a perfect number.");
        }
    }

}
