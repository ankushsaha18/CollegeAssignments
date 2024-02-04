package classass;

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate=");
        float x = sc.nextFloat();
        System.out.print("Enter y coordinate=");
        float y = sc.nextFloat();
        if (x == 0 && y == 0) {
            System.out.println("(" + x + "," + y + ")" + " is at origin ");
        } else if (x == 0) {
            System.out.println("(" + x + "," + y + ")" + " is on y axis ");
        } else if (y == 0) {
            System.out.println("(" + x + "," + y + ")" + " is on x axis ");
        } else if (x > 0 && y > 0) {
            System.out.println("(" + x + "," + y + ")" + "is in quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + "," + y + ")" + " is in quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + "," + y + ")" + " is in quadrant III");
        } else {
            System.out.println("(" + x + "," + y + ")" + " is in quadrant IV");
        }
    }
}