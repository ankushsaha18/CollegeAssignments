public class Q6c {
    public static void main(String[] args) {
        int fruits[] = { 20, 40, 30, 50, 40, 20 };
        System.out.println(numOfSlice(fruits));
    }

    public static int numOfSlice(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                ans++;
            }
        }
        return ans;
    }
}
