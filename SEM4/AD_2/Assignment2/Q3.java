package Assignment2;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] k = {24,39,46,75,92,32,95};
        System.out.println("Hashed Values ---");
        System.out.println(Arrays.toString(linearProbing(k)));
    }
    public static int[] linearProbing(int[] k){
        int n = k.length;
        int[] hash = new int[n];
        Arrays.fill(hash,-1);
        for(int i = 0 ; i < n ; i++){
            int hashValue = k[i]%n;
            if(hash[hashValue] == -1){
                hash[hashValue] = k[i];
            }else{
                for(int j = 1 ; hash[hashValue] != -1 ; j++){
                    hashValue = (k[i] + j)%n;
                }
                hash[hashValue] = k[i];
            }
        }
        return hash;
    }
}
