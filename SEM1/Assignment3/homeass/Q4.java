package homeass;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        int n = sc.nextInt();
        boolean b1 = false, b2 = false;
        if (n % 5 == 0 && n % 6 == 0) {
            b1 = true;
        }
        if (n % 5 == 0 || n % 6 == 0) {
            b2 = true;
        }
        System.out.println("Is " + n + " divisible by 5 and 6? " + b1);
        System.out.println("Is " + n + " divisible by 5 or 6? " + b2);
        System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + !b1);
        sc.close();
    }
}