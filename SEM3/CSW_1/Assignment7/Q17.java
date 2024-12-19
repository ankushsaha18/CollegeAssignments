import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min  = " + min);
    }
}
