public class Q5a {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= 10; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;
        System.out.println("Difference is:" + (sumOfSquares - squareOfSum));
    }
}
