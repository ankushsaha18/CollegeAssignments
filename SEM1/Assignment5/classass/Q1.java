package classass;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        int div1 = 0, div2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                div1 += i;
            }
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                div2 += i;
            }
        }
        if (num1 == div2 && num2 == div1) {
            System.out.println(num1 + " and " + num2 + " are Amicable numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are not Amicable numbers");
        }
    }

}
