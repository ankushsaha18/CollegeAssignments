package Assignment4;
import java.util.Arrays;

// Counting Inversions
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 4, 6, 7, 1, 6, 4};
        int inversions = sortAndCount(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Inversions: " + inversions);
    }

    public static int sortAndCount(int[] nums, int low, int high) {
        int inversions = 0;
        if (low >= high) {
            return 0;
        }
        int m = (high + low) / 2;
        inversions += sortAndCount(nums, low, m);
        inversions += sortAndCount(nums, m + 1, high);
        inversions += mergeAndCount(nums, low, m, high);
        return inversions;
    }

    public static int mergeAndCount(int[] nums, int low, int mid, int high) {
        int inversions = 0;
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
                inversions += n1 - i;
            }
        }
        return inversions;
    }
}