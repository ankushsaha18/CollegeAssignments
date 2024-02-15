import java.util.*;

public class Q2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        int x = sc.nextInt();
        System.out.print("Enter Y:");
        int y = sc.nextInt();
        if ((x + y) > 6) {
            System.out.println("Good turn");
        } else {
            System.out.println("Not a good turn");
        }
    }
}
