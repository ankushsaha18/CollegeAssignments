package classass;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year:");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year:true");
        } else {
            System.out.println(year + " is a not leap year:false");
        }
    }
}