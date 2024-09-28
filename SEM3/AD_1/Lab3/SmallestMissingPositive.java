package Lab3;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9};
        System.out.println(findMissing(arr,0,arr.length-1));
    }
    public static int findMissing(int[] arr,int start,int end){
        if(start > end){
            return start+1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == mid+1){
            return findMissing(arr,mid+1,end);
        }
        return findMissing(arr,start,mid-1);
    }
}
