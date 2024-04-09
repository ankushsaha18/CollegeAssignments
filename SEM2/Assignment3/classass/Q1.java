package classass;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int num = sc.nextInt();
        try {
            if (num < 0) {
                throw new NumberFormatException("Negative number not allowed!!");
            }
            System.out.println("Your lucky number is " + num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
