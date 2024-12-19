import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed Array ---");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }
    }
}
