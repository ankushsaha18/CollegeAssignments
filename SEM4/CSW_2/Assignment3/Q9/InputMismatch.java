package Assignment3.Q9;

import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int num = sc.nextInt();
                System.out.println("You entered: " + num);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                        sc.next();
            }
        }
        sc.close();
    }
}
