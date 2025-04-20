package Assignment5.Q13;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the file to delete: ");
        String fileName = sc.nextLine();
        File fileToDelete = new File(fileName);
        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                System.out.println("The file '" + fileName + "' has been deleted successfully.");
            } else {
                System.out.println("Failed to delete the file '" + fileName + "'.");
            }
        } else {
            System.out.println("The specified file does not exist. Please check the name and try again.");
        }
        sc.close();
    }
}
