package Assignment8.Q3;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        Thread addThread = new Thread(() -> System.out.println("Addition = " + (num1 + num2)));
        Thread subtractThread = new Thread(() -> System.out.println("Subtraction = " + (num1 - num2)));
        Thread multiplyThread = new Thread(() -> System.out.println("Multiplication = " + (num1 * num2)));
        Thread divideThread = new Thread(() -> System.out.println("Division = " + (num1 / num2)));
        addThread.start();
        subtractThread.start();
        multiplyThread.start();
        divideThread.start();
    }
}
