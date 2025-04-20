package Assignment5.Q12;

import java.io.File;
import java.util.Scanner;

public class ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Listing files and subdirectories in: " +
                    directoryPath);
            String[] filesAndDirs = directory.list();
            if (filesAndDirs != null) {
                for (String name : filesAndDirs) {
                    System.out.println(name);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified directory does not exist. Please check the path and try again.");
        }
    }
}
