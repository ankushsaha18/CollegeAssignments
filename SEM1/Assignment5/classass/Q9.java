package classass;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }

        System.out.print(sum);
    }
}
