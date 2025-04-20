package Assignment5.Q2;

public class StringImmutability {
    public static void main(String[] args) {
        String originalStr = "Hello, World!";
        System.out.println("Original String: " + originalStr);
        String modifiedStr = originalStr.replace("World", "Java");
        System.out.println("Modified String: " + modifiedStr);
        System.out.println("\nImmutability Demonstration:");
        System.out.println("Original String: " + originalStr);
        System.out.println("Modified String: " + modifiedStr);
        CharSequence charSeq = originalStr;
        System.out.println("\nUsing String as CharSequence:");
        System.out.println("Length of CharSequence: " + charSeq.length());
        System.out.println("Char at index 7: " + charSeq.charAt(7));
        System.out.println("Subsequence (0 to 4): " + charSeq.subSequence(0,
                5));
    }
}
