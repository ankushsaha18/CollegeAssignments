package Assignment7.Q9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start date (yyyy-MM-dd): ");
        LocalDate startDate = LocalDate.parse(sc.next());
        LocalDate currentDate = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(startDate, currentDate);
        System.out.print("Enter the initial amount: ");
        double principal = sc.nextDouble();
        double intRate = 8.0;
        double timeInYears = daysBetween / 365.0;
        double interest = (principal * intRate * timeInYears) / 100;
        double totalAmount = principal + interest;
        System.out.println("Interest accrued: " + interest);
        System.out.println("Total amount after interest: " + totalAmount);
    }
}