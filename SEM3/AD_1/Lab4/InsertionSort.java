package Lab4;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,18,5,21};
        int n = arr.length;
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] A,int n){
        for(int j = 1 ; j < n ; j++){
            int temp = A[j];
            int i = j-1;
            while(i >= 0 && A[i] > temp){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = temp;
        }
    }
}
