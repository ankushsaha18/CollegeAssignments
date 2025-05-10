package Assignment7.Q2;

interface Calculator {
    double operate(double a, double b);
}
public class CalculatorOperations {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        double x = 15;
        double y = 3;
        System.out.println("Addition: " + addition.operate(x, y));
        System.out.println("Subtraction: " + subtraction.operate(x, y));
        System.out.println("Multiplication: " + multiplication.operate(x, y));
        System.out.println("Division: " + division.operate(x, y));
    }
}