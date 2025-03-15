package Assignment2.Assignment2_2.Q10;

import java.util.HashMap;

public class SmallestMissing {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,9};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 1 ; i <= 10 ; i++){
            hm.put(i,0);
        }
        for (int i : arr){
            hm.put(i,hm.get(i)+1);
        }
        for (int i : hm.keySet()){
            if(hm.get(i) == 0){
                System.out.println("Smallest missing positive number is: " + i);
                return;
            }
        }
        System.out.println("Smallest missing positive number is: " + 0);
    }
}
