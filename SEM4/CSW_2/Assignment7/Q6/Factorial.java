package Assignment7.Q6;
import java.util.function.Function;

public class Factorial {
    public static Function<Integer, Integer> getFactorial() {
        return n -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> factorial = getFactorial();
        int[] numbers = {0, 1, 5, -7};
        for (int num : numbers) {
            System.out.println("Factorial of " + num + " is " + factorial.apply(num));
        }
    }
}