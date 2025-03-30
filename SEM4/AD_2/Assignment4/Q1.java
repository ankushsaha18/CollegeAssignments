package Assignment4;
import java.util.Arrays;

// Merge Sort
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 4, 6, 7, 1, 6, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        for (int i = 0; i < n1; i++)
            L[i] = nums[low + i];
        for (int j = 0; j < n2; j++)
            R[j] = nums[mid + 1 + j];
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for(int k = low ; k <= high ; k++){
            if(L[i] <= R[j]){
                nums[k] = L[i++];
            }else{
                nums[k] = R[j++];
            }
        }
    }
}