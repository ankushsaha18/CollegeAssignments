package homeass;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(gcd(6,9));
    }
    public static int gcd(int m,int n){
        if(m%n == 0){
            return n;
        }
        return gcd(n,m%n);
    }
}
