public class pairEqualSpecific_24 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 4, -5, 11, 5, 20 };
        int sElement = 15;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sElement) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sElement);
                }
            }
        }
    }
}
