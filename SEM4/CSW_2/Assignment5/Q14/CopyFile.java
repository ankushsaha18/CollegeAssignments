package Assignment5.Q14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file path: ");
        String sourcePath = sc.nextLine();
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("The specified source file does not exist.");
            return;
        }
        System.out.print("Enter the destination file path: ");
        String destinationPath = sc.nextLine();
        File destinationFile = new File(destinationPath);
        if (destinationFile.exists()) {
            System.out.print("The destination file exists. Overwrite? (yes/no): ");
            if (!sc.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("Copy operation cancelled.");
                return;
            }
        }
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error during copy: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
