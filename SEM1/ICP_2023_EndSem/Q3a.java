import java.util.Scanner;

public class Q3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate:");
        double x = sc.nextDouble();
        System.out.print("Enter y coordinate:");
        double y = sc.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("(" + x + "," + y + ") lies in origin");
        } else if (x == 0 && y != 0) {
            System.out.println("(" + x + "," + y + ") lies in y axis");
        } else if (y == 0 && x != 0) {
            System.out.println("(" + x + "," + y + ") lies in x axis");
        } else if (x > 0 && y > 0) {
            System.out.println("(" + x + "," + y + ")lies in 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + "," + y + ") lies in 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + "," + y + ") lies in 3rd quadrant");
        } else {
            System.out.println("(" + x + "," + y + ") lies in 4th quadrant");
        }
    }
}
