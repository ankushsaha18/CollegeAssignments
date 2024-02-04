package classass;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int input = sc.nextInt();
        int output = 0;
        int count = 0;
        while (input > 0) {
            int temp = input % 10;
            input /= 10;
            if (temp != 0) {
                output += temp * Math.pow(10, count);
                count++;
            }
        }
        System.out.println("Number without zeros:" + output);
    }
}