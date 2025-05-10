package Assignment7.Q8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCustomFormat {
    public static void main(String[] args) {
        LocalDateTime DateTime = LocalDateTime.of(2025, 5, 2, 14, 30, 45);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = DateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
