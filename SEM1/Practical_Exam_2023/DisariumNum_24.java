public class DisariumNum_24 {
    public static void main(String[] args) {
        System.out.println(checkDisarium(155));
    }

    public static boolean checkDisarium(int n) {
        int sum = 0;
        int og = n;
        int digits = (int) Math.log10(n) + 1;
        while (digits > 0) {
            sum += Math.pow(n % 10, digits);
            digits--;
            n /= 10;
        }
        return og == sum;
    }
}
