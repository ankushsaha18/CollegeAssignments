public class Q6b {
    public static void main(String[] args) {
        String pass = "12virat";
        System.out.println(validPassword(pass));
    }

    public static boolean validPassword(String pass) {
        boolean ans = true;
        if (pass.length() < 8) {
            ans = false;
        }
        int digCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                digCount++;
            }
        }
        if (digCount < 2) {
            ans = false;
        }
        return ans;
    }
}
