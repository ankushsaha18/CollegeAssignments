package Lab6;

import java.util.Arrays;

public class MaxMinDifference {
    public static void main(String[] args) {
        int[] arr = {30, 5, 20, 9};
        System.out.println("Maximum Pair = " + Arrays.toString(maxDiff(arr)));
        System.out.println("Minimum Pair = " + Arrays.toString(minDiff(arr)));
    }
    public static int[] maxDiff(int[] arr){
        int temp = Integer.MIN_VALUE;
        int[] ans = {-1,-1};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int diff = Math.abs(arr[i] - arr[j]);
                if(diff > temp){
                    temp = diff;
                    ans = new int[]{arr[i],arr[j]};
                }
            }
        }
        return ans;
    }
    public static int[] minDiff(int[] arr){
        int temp = Integer.MAX_VALUE;
        int[] ans = {-1,-1};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int diff = Math.abs(arr[i] - arr[j]);
                if(diff < temp){
                    temp = diff;
                    ans = new int[]{arr[i],arr[j]};
                }
            }
        }
        return ans;
    }
}
