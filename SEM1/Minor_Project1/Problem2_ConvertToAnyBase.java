
public class Problem2_ConvertToAnyBase {

    public static void main(String[] args) {
        int n = 24157;
        int b = 16;
        System.out.println("Number " + n + " from decimal to base " + b + " is: " + convertToAnyBase(n, b));
    }

    public static String convertToAnyBase(int n, int b) {
        if (b < 2 || b > 36) {
            throw new IllegalArgumentException("Base must be between 2 and 36!!");
        }
        String ans = "";
        while (n > 0) {
            int rem = n % b;
            if (rem > 9) {
                ans = (char) ('A' + (rem % 10)) + ans;
            } else {
                ans = rem + ans;
            }
            n /= b;
        }
        return ans;
    }

}
