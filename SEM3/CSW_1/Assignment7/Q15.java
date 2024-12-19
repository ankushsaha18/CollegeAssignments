import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += (double)1/i;
        }
        System.out.println("Sum is = " + sum);
    }
}
