public class Twin_Prime_24 {
    public static void main(String[] args) {
        System.out.println(checkTwinPrime(21, 23));
    }

    public static boolean checkTwinPrime(int a, int b) {
        if ((Math.abs(a - b) == 2) && isPrime(a) && isPrime(b)) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
