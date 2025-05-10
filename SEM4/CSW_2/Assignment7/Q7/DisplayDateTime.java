package Assignment7.Q7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        LocalDate futureDate = LocalDate.now().plusWeeks(2);
        System.out.println("Date after 2 weeks: " + futureDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = LocalDate.now().format(formatter);
        System.out.println("Formatted Current Date: " + formattedDate);
    }
}
