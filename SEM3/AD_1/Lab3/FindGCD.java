package Lab3;

public class FindGCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
