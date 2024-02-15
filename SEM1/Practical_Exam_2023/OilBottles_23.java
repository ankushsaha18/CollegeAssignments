import java.util.*;

public class OilBottles_23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X and Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Number of 5 liter bottles: " + (y / x));
        System.out.println("Number of 1 liter bottles: " + (y % x));
    }
}
