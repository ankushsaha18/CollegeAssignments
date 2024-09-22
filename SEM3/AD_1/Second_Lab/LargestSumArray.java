package Second_Lab;

public class LargestSumArray {
    public static void main(String[] args) {
        int[] arr = {4,5,-2,1,-4,3,7};
        System.out.println(largestSum(arr));
    }
    public static int largestSum(int[] arr){
        int ans = 0;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
