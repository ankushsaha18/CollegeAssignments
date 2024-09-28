package Lab3;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,99,7,8,0,-1,72};
        int n = arr.length;
        System.out.println("Max is: " + max(arr,n));
        System.out.println("Min is: " + min(arr,n));
    }
    public static int max(int[] arr,int n){
        if(n == 1){
            return arr[0];
        }
        return Math.max(arr[n-1],max(arr,n-1));
    }
    public static int min(int[] arr,int n){
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1],min(arr,n-1));
    }
}
