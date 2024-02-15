import java.util.Scanner;

public class Q4c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / (Math.pow(i, 2));
        }
        System.out.println(sum);
    }
}
