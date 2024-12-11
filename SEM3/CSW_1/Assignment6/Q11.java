import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(countEven(n));
    }
    public static int countEven(int n){
        int cnt = 0;
        n = Math.abs(n);
        while (n > 0){
            if((n%10)%2 == 0){
                cnt++;
            }
            n /= 10;
        }
        return cnt;
    }
}
