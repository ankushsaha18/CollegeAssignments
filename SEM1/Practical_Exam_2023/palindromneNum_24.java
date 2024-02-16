public class palindromneNum_24 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }

    public static boolean isPalindrome(int n) {
        String a = String.valueOf(n);
        int i = 0, j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
