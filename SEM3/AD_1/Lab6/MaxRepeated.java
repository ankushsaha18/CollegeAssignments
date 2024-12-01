package Lab6;

public class MaxRepeated {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,5,7,3,5,9,4,1};
        System.out.println(findMaxRepeated(arr));
    }
    public static int findMaxRepeated(int[] arr){
        int ans = arr[0];
        int temp = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > temp){
                temp = count;
                ans = arr[i];
            }
        }
        return ans;
    }
}
