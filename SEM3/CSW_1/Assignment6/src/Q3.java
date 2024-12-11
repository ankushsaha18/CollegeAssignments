import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter i and j: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int ithBit = (n >> i) & 1;
        int jthBit = (n >> j) & 1;
        if (ithBit != jthBit) {
            n ^= (1 << i);
            n ^= (1 << j);
        }
        System.out.println("After Swapping = " + n);
    }
}
