package Assignment8.Q2;

class AdditionThread extends Thread {
    private int a, b;
    public AdditionThread(int a, int b) {
        this.a = a; this.b = b;
    }
    public void run() {
        System.out.println("Addition = " + (a + b));
    }
}
class SubtractionThread extends Thread {
    private int a, b;
    public SubtractionThread(int a, int b) {
        this.a = a; this.b = b;
    }
    public void run() {
        System.out.println("Subtraction = " + (a - b));
    }
}
class MultiplicationThread extends Thread {
    private int a, b;
    public MultiplicationThread(int a, int b) {
        this.a = a; this.b = b;
    }
    public void run() {
        System.out.println("Multiplication = " + (a * b));
    }
}
class DivisionThread extends Thread {
    private int a, b;
    public DivisionThread(int a, int b) {
        this.a = a; this.b = b;
    }
    public void run() {
        System.out.println("Division = " + ((double) a / b));
    }
}
public class Calculator {
    public static void main(String[] args) {
        int num1 = 20, num2 = 5;
        AdditionThread additionThread = new AdditionThread(num1, num2);
        SubtractionThread subtractionThread = new SubtractionThread(num1, num2);
        MultiplicationThread multiplicationThread = new MultiplicationThread(num1, num2);
        DivisionThread divisionThread = new DivisionThread(num1, num2);
        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisionThread.start();
    }
}
