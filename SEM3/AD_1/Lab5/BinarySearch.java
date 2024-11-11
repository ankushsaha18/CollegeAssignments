public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int element = 77;
        System.out.println(binarysearch(arr,element));
    }
    public static int binarysearch(int[] arr,int element){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == element){
                return mid;
            }
            else if(arr[mid] > element){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
