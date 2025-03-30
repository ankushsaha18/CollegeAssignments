package Assignment4;
import java.util.Arrays;

// Quick Sort
public class Q3 {
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int partIndex = partition(arr, low, high);
        quickSort(arr, low, partIndex - 1);
        quickSort(arr, partIndex + 1, high);
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}