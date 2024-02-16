public class commonPrimeDiv_24 {
    public static void main(String[] args) {
        int a = 33;
        int b = 22;
        System.out.print("Common prime divisors are: ");
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
