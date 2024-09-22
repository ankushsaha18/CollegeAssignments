package Second_Lab;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n < 2){
            return 0;
        }
        int a = 0;
        int b = 1;
        int c;
        for(int i = 2 ; i <= n ; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
