package Assignment3;

import java.util.Arrays;

public class Q2 {
    public static double fractionalKnapSack(int[] weight, int[] profit, int capacity) {
        int n = weight.length;
        double ans = 0;
        double[][] ratio = new double[n][2];
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) profit[i] / weight[i];
        }
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
        for (int i = 0; i < n; i++) {
            int index = (int) ratio[i][0];
            if (capacity == 0) {
                break;
            }
            if (weight[index] <= capacity) {
                capacity -= weight[index];
                ans += profit[index];
            } else {
                ans += profit[index] * ((double) capacity / weight[index]);
                capacity = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] weights = {10, 17, 6};
        int[] profit = {200, 50, 50};
        int capacity = 25;
        System.out.println(fractionalKnapSack(weights, profit, capacity));
    }
}
