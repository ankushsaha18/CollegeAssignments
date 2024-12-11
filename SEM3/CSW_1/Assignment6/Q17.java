import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
    public static boolean isEven(int n){
        return (n&1) != 1;
    }
}
