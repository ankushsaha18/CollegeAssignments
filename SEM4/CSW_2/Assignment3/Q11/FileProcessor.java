package Assignment3.Q11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileProcessor {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new
                FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Processed: " + line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
