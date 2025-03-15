package Assignment2.Assignment2_2.Q9;

import java.util.HashSet;

public class RepeatingIntegers {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,8,9,4,1};
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("Repeating integers are ---");
        for (int i : arr){
            if(hs.add(i)){
                continue;
            }
            System.out.print(i + ",");
        }
    }
}
