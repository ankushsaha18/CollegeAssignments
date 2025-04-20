package Assignment5.Q7;

import java.util.Scanner;

public class WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String originalStr = sc.nextLine();
        System.out.println("Enter the word you want to search for:");
        String searchStr = sc.nextLine();
        System.out.println("Enter the word you want to replace with:");
        String replaceStr = sc.nextLine();
        int index = originalStr.indexOf(searchStr);
        if (index != -1) {
            String modifiedString = originalStr.substring(0, index) + replaceStr
                    + originalStr.substring(index + searchStr.length());
            System.out.println("Original Sentence: " + originalStr);
            System.out.println("Modified Sentence: " + modifiedString);
        } else {
            System.out.println("The word '" + searchStr + "' was not found in the sentence.");
        }
        sc.close();
    }
}
