import java.util.Scanner;

public class Q4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if (sumOfDigits(n) % 9 == 0) {
            System.out.println(n + " is divisible by 9");
        } else {
            System.out.println(n + " is not divisible by 9");
        }

    }

    public static int sumOfDigits(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}
