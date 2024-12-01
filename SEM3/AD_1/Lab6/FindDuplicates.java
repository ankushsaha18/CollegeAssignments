package Lab6;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,7,8,9,1,3,4};
        printDuplicates(arr);
    }
    public static void printDuplicates(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
