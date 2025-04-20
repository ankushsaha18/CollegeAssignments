package Assignment3.Q6;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {15, 8, 25, 5, 18, 30, 10};
        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.print("Enter an element to search: ");
        int searchElement = sc.nextInt();
        int searchIndex = Arrays.binarySearch(array, searchElement);
        if (searchIndex >= 0) {
            System.out.println("Element " + searchElement + " found at index: "
                    + searchIndex);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        System.out.print("Enter an index to access: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element at index " + index + ": " +
                    array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index out of bounds.");
        }
        System.out.println("Program execution completed!");
        sc.close();
    }
}
