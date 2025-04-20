package Assignment5.Q8;

import java.util.Scanner;

public class StringExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();
        while (true) {
            System.out.println("\n--- String Operations Menu --- ");
                    System.out.println("1. Convert to Lowercase");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Search for a Character");
            System.out.println("4. Search for an Index");
            System.out.println("5. Concatenate with Another String");
            System.out.println("6. Exit");
            System.out.print("Please choose an option (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lowercase: " + str1.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + str1.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter the character to search for: ");
                    char charToSearch = sc.nextLine().charAt(0);
                    int charIndex = str1.indexOf(charToSearch);
                    if (charIndex != -1) {
                        System.out.println("Character '" + charToSearch + "' found at index: " + charIndex);
                    } else {
                        System.out.println("Character '" + charToSearch + "' not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index to get the character: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < str1.length()) {
                        System.out.println("Character at index " + index + " is: " + str1.charAt(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the string to concatenate: ");
                    String str2 = sc.nextLine();
                    String concatStr = str1 + str2;
                    System.out.println("Concatenated String: " + concatStr);
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-6).");
            }
        }
    }
}
