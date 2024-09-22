package First_Lab;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,77,8,9,50};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum is:" + max);
        System.out.println("Minimum is: " + min);
    }
}
