package Assignment3.Q1;

public class NullPointException {
    public static void main(String[] args) {
        String str1 = "Anindya2004";
        String str2 = "Anindya";
        String str3 = null;
        try {
            extractAndShowNumbers(str1);
            extractAndShowNumbers(str2);
            extractAndShowNumbers(str3);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void extractAndShowNumbers(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Input string cannot be null or empty.");
        }
        StringBuilder numChar = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                numChar.append(ch);
            }
        }
        if (numChar.length() > 0) {
            System.out.println("Numeric characters extracted: " +
                    numChar.toString());
        } else {
            System.out.println("No numeric characters found in the input string.");
        }
    }
}

/* OUTPUT ---
    Numeric characters extracted: 2004
    No numeric characters found in the input string.
    Input string cannot be null or empty.
 */

