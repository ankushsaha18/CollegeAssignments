package Assignment3.Q5;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        String input1 = sc.next();
        String input2 = sc.next();
        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            try {
                int result = num1 / num2;
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter valid integers.");
        }
        sc.close();
    }
}
