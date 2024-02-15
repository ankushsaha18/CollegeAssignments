import java.util.Scanner;

public class Q7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(x);
    }
}
