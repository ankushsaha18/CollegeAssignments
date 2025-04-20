package Assignment5.Q9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiaryOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "diary.txt";
        File diaryFile = new File(fileName);
        if (diaryFile.exists()) {
            System.out.println("The diary file already exists.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile))) {
            System.out.print("Please enter your diary entry: ");
            String entry = sc.nextLine();
            String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write("Date: " + currentDate);
            writer.newLine();
            writer.write("Entry: " + entry);
            writer.newLine();
            System.out.println("Your diary entry has been saved to " +
                    fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
