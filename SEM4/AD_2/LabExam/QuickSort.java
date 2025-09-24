package LabExam;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {45,12,78,23,56,89,12,33};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int p = partition(arr,start,end);
        quicksort(arr,start,p-1);
        quicksort(arr,p+1,end);
    }
    public static int partition(int[] arr,int start,int end){
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start ; j < end ; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
