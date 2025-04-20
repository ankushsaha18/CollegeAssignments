package Assignment5.Q10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDiary {
    public static void main(String[] args) {
        String fileName = "diary.txt";
        File diaryFile = new File(fileName);
        if (!diaryFile.exists()) {
            System.out.println("The diary file does not exist. Please create a diary entry first.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new
                FileReader(diaryFile))) {
            String line;
            System.out.println("Your Diary Entries:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the diary file.");
            e.printStackTrace();
        }
    }
}
