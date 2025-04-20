package Assignment3.Q4;

import java.util.Scanner;

public class SqRtCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        try {
            int num = sc.nextInt();
            if (num < 0) {
                throw new ArithmeticException("Cannot calculate the square root of a negative number.");
            }
            double sqRt = Math.sqrt(num);
            System.out.println("The square root of " + num + " is: " + sqRt);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
