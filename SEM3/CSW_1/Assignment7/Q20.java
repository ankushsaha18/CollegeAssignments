import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        System.out.println("Sorted Array ---");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static  void bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
