package homeass;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,15,25,65};
        System.out.println(binarySearch(arr,7,0,arr.length - 1));
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        int m = start + (end - start)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return binarySearch(arr,target,start,m);
        }
        return binarySearch(arr,target,m + 1,end);
    }
}
