package Assignment3.Q3;

import java.util.Scanner;

public class StringToIntegerConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a numeric value: ");
                int number = Integer.parseInt(sc.nextLine());
                System.out.println("You entered the number: " + number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }
        }
        sc.close();
    }
}
