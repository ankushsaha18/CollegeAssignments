package classass;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
    }
    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
