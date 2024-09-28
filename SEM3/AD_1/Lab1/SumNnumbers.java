package Lab1;
import java.util.Scanner;

public class SumNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println("Sum is:" + sum);
    }
}
