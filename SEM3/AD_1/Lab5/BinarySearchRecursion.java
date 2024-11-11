public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int element = 7;
        System.out.println(binarysearch(arr,element,0,arr.length-1));
    }
    public static int binarysearch(int[] arr,int element,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid] == element){
            return mid;
        }
        else if(arr[mid] > element){
            return binarysearch(arr,element,start,mid-1);
        }
        return binarysearch(arr,element,mid+1,end);
    }
}
