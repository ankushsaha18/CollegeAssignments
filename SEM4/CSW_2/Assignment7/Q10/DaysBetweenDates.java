package Assignment7.Q10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start date (YYYY-MM-DD): ");
        LocalDate startDate = LocalDate.parse(sc.nextLine());
        System.out.print("Enter the end date (YYYY-MM-DD): ");
        LocalDate endDate = LocalDate.parse(sc.nextLine());
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Number of days between the two dates: " + daysBetween);
    }
}
