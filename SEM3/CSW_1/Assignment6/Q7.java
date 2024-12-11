import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x,y));
    }
    public static  int power(int x,int y){
        int ans = 1;
        while (y > 0){
            ans *= x;
            y--;
        }
        return ans;
    }
}
