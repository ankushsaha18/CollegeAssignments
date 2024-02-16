public class MagicNum_24 {
    public static void main(String[] args) {
        System.out.println(checkMagicNumber(1891));
    }

    public static boolean checkMagicNumber(int n) {
        int sum = 0;
        while (n > 0 || sum / 10 > 0) {
            if (n > 0) {
                sum += n % 10;
                n /= 10;
            } else {
                n = sum;
                sum = 0;
            }
        }
        return sum == 1;
    }
}
