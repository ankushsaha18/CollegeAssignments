package Assignment3;
import java.util.ArrayList;

// Interval Scheduling


public class Q1 {
    public static ArrayList<Integer> intervalScheduling(int[] start,int[] finish){
        int n = start.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        int current = 0;
        for (int i = 1 ; i < n ; i++){
            if(finish[current] <= start[i]){
                ans.add(i+1);
                current = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] start = {4,5,6,8,9,10,6,12};
        int[] finish = {6,7,8,10,11,11,8,13};
        System.out.println(intervalScheduling(start,finish));
    }
}
