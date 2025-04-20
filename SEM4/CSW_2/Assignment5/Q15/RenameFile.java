package Assignment5.Q15;

import java.io.File;
import java.util.Scanner;

public class RenameFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current file name: ");
        File currFile = new File(sc.nextLine());
        if (!currFile.exists() || !currFile.isFile()) {
            System.out.println("The specified file does not exist.");
            return;
        }
        System.out.print("Enter the new file name: ");
        File newFile = new File(sc.nextLine());
        if (currFile.renameTo(newFile)) {
            System.out.println("File renamed successfully to '" +
                    newFile.getName() + "'.");
        } else {
            System.out.println("Failed to rename the file. Please check if the new file name is valid.");
        }
        sc.close();
    }
}
