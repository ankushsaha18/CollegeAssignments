package Second_Lab;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        maxmin(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void maxmin(int[] arr){
        int[] aux = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            aux[i] = arr[i];
        }
        int start = 0;
        int end = arr.length-1;
        for(int i = 0 ; i < arr.length ; i++){
            if(i%2 == 0){
                arr[i] = aux[end];
                end--;
            }else{
                arr[i] = aux[start];
                start++;
            }
        }
    }
}
