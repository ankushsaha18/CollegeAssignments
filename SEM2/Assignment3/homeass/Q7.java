package homeass;
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {9,6,16,5,18,3,1,2,7,22};
        int k = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println("After Rearrangement ---");
        sort(arr,k,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int k,int low,int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;

        while (arr[s] <= k){
            s++;
        }
        while (arr[e] > k){
            e--;
        }
        if(s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        sort(arr,k,s,e);
    }
}
