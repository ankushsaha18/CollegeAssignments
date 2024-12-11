import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int ans = 0;
        while (n != 0){
            ans += n & 1;
            n = n >> 1;
        }
        System.out.println("No. of 1 bits are = " + ans);
    }
}
