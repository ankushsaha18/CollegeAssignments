import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(create(x,y));
    }
    public static int create(int a,int b){
        int ans = 0;
        while (a/100 > 0){ // reduce a to two digits
            a /= 10;
        }
        ans += b%100; // last two digits of b
        ans = a*100 + ans;
        return ans;
    }
}
