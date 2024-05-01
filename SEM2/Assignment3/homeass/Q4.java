package homeass;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(product(20,5));
    }
    public static int product(int a, int b){
        if(b == 0){
            return 0;
        }
        return a + product(a,b-1);
    }
}
