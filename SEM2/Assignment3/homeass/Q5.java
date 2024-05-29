package homeass;

public class Q5 {
    public static void main(String[] args) {
        String s = "Ankush";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
