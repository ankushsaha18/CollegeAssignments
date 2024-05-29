package homeass;

public class Q3 {
    public static void main(String[] args) {

        System.out.println(binEquivalent(10));
    }
    public static String  binEquivalent(int n){
        if(n <= 0){
            return "";
        }
        return binEquivalent(n/2) + (n%2);
    }
}
