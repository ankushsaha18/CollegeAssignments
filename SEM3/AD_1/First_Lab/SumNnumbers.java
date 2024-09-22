package First_Lab;
import java.util.Scanner;

public class SumNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Enter Numbers:");
        for(int i = 0 ; i < n ; i++){
            sum += sc.nextInt();
        }
        System.out.println("Sum is = " + sum);
    }
}
