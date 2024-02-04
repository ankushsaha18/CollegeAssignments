package homeass;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int td = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int ed = sc.nextInt();
        String day1 = "", day2 = "";
        switch (td) {
            case 0:
                day1 = "Sunday";
                break;
            case 1:
                day1 = "Monday";
                break;
            case 2:
                day1 = "Tuesday";
                break;
            case 3:
                day1 = "Wednesday";
                break;
            case 4:
                day1 = "Thursday";
                break;
            case 5:
                day1 = "Friday";
                break;
            case 6:
                day1 = "Saturday";
                break;
        }
        switch ((td + ed) % 7) {
            case 0:
                day2 = "Sunday";
                break;
            case 1:
                day2 = "Monday";
                break;
            case 2:
                day2 = "Tuesday";
                break;
            case 3:
                day2 = "Wednesday";
                break;
            case 4:
                day2 = "Thursday";
                break;
            case 5:
                day2 = "Friday";
                break;
            case 6:
                day2 = "Saturday";
                break;
        }
        System.out.println("Today is " + day1 + " and the future day is " + day2);
        sc.close();
    }
}