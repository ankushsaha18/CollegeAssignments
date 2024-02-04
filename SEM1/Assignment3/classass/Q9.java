package classass;

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number: ");
        int a = sc.nextInt();
        System.out.println("Enter value of second number: ");
        int b = sc.nextInt();
        System.out.println("Enter value of third number: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The largest number is " + a);
            if (b > c) {
                System.out.println("The second largest number is " + b);
            } else {
                System.out.println("The second largest number is " + c);
            }
        } else if (b > c && b > a) {
            System.out.println("The largest number is " + b);
            if (a > c) {
                System.out.println("The second largest number is " + a);
            } else {
                System.out.println("The second largest number is " + c);
            }
         } else {
            System.out.println("The largest number is " + c);
            if (a > b) {
                System.out.println("The second largest number is " + a);
            } else {
                System.out.println("The second largest number is " + b);
            }
        }
    }
}
