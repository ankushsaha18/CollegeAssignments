import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = multiply(x,y);
        System.out.println(ans);
    }
    public static int multiply(int x,int y){
        int ans = 0;
        int sign = 1; // To get result of two negative numbers
        if((x<0 && y>0) || (x>0 && y<0)){
            sign = -1;
        }
        x = Math.abs(x);
        y = Math.abs(y);
        while(y > 0){
            if((y&1) == 1){
                ans = bitwiseAdder(ans,x);
            }
            x <<= 1; // double the value of x
            y >>= 1; // half the value of y
        }
        return sign*ans;
    }
    public static int bitwiseAdder(int a,int b){
        while (b != 0){
            int carry = a&b;
            a = a^b;
            b = carry << 1;
        }
        return a;
    }
}
