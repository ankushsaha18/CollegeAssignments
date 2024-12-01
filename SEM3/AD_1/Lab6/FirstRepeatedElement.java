package Lab6;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,8,7,3,5};
        System.out.println(firstRepeated(arr));
    }
    public static int firstRepeated(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
