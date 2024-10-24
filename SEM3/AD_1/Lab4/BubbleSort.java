package Lab4;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] A,int n){
        for(int i = 0 ; i < n-1 ; i++){
            boolean flag = false;
            for(int j = 0 ; j < n-i-1 ; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
