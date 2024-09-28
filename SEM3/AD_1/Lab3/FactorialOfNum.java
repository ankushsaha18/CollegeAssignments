package Lab3;

public class FactorialOfNum {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n < 2){
            return 1;
        }
        return n*factorial(n-1);
    }
}
