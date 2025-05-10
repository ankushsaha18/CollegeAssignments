package Assignment7.Q5;

import java.util.function.Function;

public class SquareCalculator {
    public static Function<Integer, Integer> getSquare() {
        return x -> x * x;
    }
    public static void main(String[] args) {
        Function<Integer, Integer> square = getSquare();
        int[] numbers = {2, 5, 10, -3};
        for (int num : numbers) {
            int result = square.apply(num);
            System.out.println("Square of " + num + " is " + result);
        }
    }
}
