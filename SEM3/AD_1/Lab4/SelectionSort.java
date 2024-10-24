package Lab4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        selectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] A,int n){
        for(int i = 0 ; i < n-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < n ; j++){
                if(A[j] < A[min]){
                    min = j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
    }
}
