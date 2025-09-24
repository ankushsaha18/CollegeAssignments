package Assignment8.Q1;

class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("SumThread interrupted");
            }
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);
    }
}
class MultiplicationThread extends Thread {
    private int number;
    public MultiplicationThread(int number) {
        this.number = number;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                System.out.println("MultiplicationThread interrupted");
            }
        }
    }
}
public class MultiTask {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        MultiplicationThread multiplicationThread = new MultiplicationThread(5);
        sumThread.start();
        multiplicationThread.start();
    }
}
