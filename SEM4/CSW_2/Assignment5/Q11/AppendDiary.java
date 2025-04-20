package Assignment5.Q11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppendDiary {
    public static void main(String[] args) {
        String fileName = "diary.txt";
        File diaryFile = new File(fileName);
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile, true))) {
            System.out.print("Please enter your new diary entry: ");
            String entry = scanner.nextLine();
            String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write("Date: " + currentDate);
            writer.newLine();
            writer.write("Entry: " + entry);
            writer.newLine();
            System.out.println("Your new diary entry has been added to " +
                    fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the diary file.");
            e.printStackTrace();
        }
    }
}
