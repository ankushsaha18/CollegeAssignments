package LabExam;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1023,501,1432,876,342};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        for (int i = 0 ; i < n1 ; i++){
            L[i] = arr[start+i];
        }
        for (int j = 0 ; j < n2 ; j++){
            R[j] = arr[mid+j+1];
        }
        L[n1] = Integer.MIN_VALUE;
        R[n2] = Integer.MIN_VALUE;
        int i = 0,j = 0;
        for (int k = start ; k <= end ; k++){
            if(L[i] >= R[j]){
                arr[k] = L[i++];
            }else {
                arr[k] = R[j++];
            }
        }
    }
}
