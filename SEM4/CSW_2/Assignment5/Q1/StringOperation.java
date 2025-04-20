package Assignment5.Q1;

public class StringOperation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("Using == to compare:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("\nUsing .equals() to compare:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
    }
}
