package Second_Lab;

public class SmallestPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {1,2,4,-2,5,6,-7};
        System.out.println(smallestMissing(arr));
    }
    public static int smallestMissing(int[] arr){
        int ans = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.length ; i++){
            boolean found = false;
            for (int k : arr) {
                if (k == i) {
                    found = true;
                    break;
                }
            }
            if(!found){
                ans = Math.min(i,ans);
            }
        }
        return ans;
    }
}
