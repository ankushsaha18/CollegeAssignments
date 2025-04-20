package Assignment5.Q6;

import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        char[] charArray = inputString.toCharArray();
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("Enter a character to search: ");
        char searchChar = sc.next().charAt(0);
        int firstOccur = -1;
        int lastOccur = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstOccur == -1) {
                    firstOccur = i;
                }
                lastOccur = i;
            }
        }
        System.out.println("\nResults:");
        if (firstOccur == -1) {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        } else {
            System.out.println("First occurrence of '" + searchChar + "': Index " + firstOccur);
                    System.out.println("Last occurrence of '" + searchChar + "': Index " + lastOccur);
        }
        sc.close();
    }
}
