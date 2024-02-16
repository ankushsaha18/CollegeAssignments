import java.util.Arrays;

public class ZeroAtEnd_24 {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 6, 0, 0, 3, 9, 0, 8, 0, 7 };
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZero(int arr[]) {
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[count++] = i;
            }
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

}
