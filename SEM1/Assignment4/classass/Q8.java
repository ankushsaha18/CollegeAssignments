package classass;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(1, 10);
        int guess = 0;
        while (guess != number) {
            System.out.print("Guess a number between 1 and 10:");
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high, try again.");
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Good guess!");
            }
        }
    }
}