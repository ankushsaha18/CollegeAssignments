import java.util.*;

public class Problem1_RotateRight {

    public static void rotateRightBy2bits(int arr[]) {
        int[] lastBits = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            lastBits[i + 1] = arr[i] << 30;
        }
        lastBits[0] = arr[arr.length - 1] << 30;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lastBits[i] | arr[i] >> 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 11, 12, 13 };
        System.out.print("Decimal Array before rotation -> ");
        arrayPrint(arr);
        System.out.print("Binary Array before rotation -> ");
        bianryPrintArray(arr);
        rotateRightBy2bits(arr);
        System.out.print("Binary Array after rotation -> ");
        bianryPrintArray(arr);
        System.out.print("Decimal Array after rotation -> ");
        arrayPrint(arr);

    }

    public static void bianryPrintArray(int arr[]) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(Integer.toBinaryString(i) + " ");
        }
        System.out.println("]");
    }

    public static void arrayPrint(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
