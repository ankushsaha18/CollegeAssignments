package Lab2;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int ans = 1;
        while (n > 1){
            ans *= n;
            n--;
        }
        return ans;
    }
}
