import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int parity = 0;
        while (n != 0){
            parity += n & 1;
            n >>= 1;
        }
        parity %= 2;
        System.out.println("Parity of the number is = " + parity);
    }
}
