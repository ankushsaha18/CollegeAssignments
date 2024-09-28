package Lab3;

public class GenerateNthFibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n < 2){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
