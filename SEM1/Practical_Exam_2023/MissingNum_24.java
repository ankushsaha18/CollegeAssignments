public class MissingNum_24 {
    public static void main(String[] args) {
        int[] array1 = { 7, 5, 3, 9, 1, 6 };
        int[] array2 = { 2, 9, 7, 4, 1, 8 };
        System.out.print("Missing elements: ");
        findMissingNumbers(array1, array2);
        findMissingNumbers(array2, array1);
    }

    public static void findMissingNumbers(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            boolean found = true;
            for (int j : arr2) {
                if (i == j) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.print(i + " ");
            }
        }
    }
}
