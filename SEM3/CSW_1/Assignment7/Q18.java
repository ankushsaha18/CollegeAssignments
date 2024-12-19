import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K:");
        int k = sc.nextInt();
        if(k >= n || k <0){
            System.out.println("Invalid K");
        }else{
            Arrays.sort(arr);
            System.out.println(k + "th smallest = " + arr[k-1]);
            System.out.println(k + "th largest = " + arr[n-k]);
        }
    }
}
