import java.util.*;

public class Cryptying_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Encrypted message:");
        String s = sc.next();
        int index = 0, inc = 0;
        /*
         * index stores the index og the character to add in answer
         * incr stores the increment for index
         */
        String ans = "";
        while (index < s.length()) {
            ans += s.charAt(index);
            index += ++inc;
        }
        System.out.println("Decrypted Message is: " + ans);
    }
}
