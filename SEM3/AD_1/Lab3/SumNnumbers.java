package Lab3;

public class SumNnumbers {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n <= 1){
            return n;
        }
        return n+sum(n-1);
    }
}
