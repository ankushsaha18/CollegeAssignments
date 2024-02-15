import java.util.Scanner;

public class Q3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Speed of Tom and Jerry respectively:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y > x) {
            System.out.println("Tom will be able to catch Jerry");
        } else {
            System.out.println("Tom cannot catch Jerry");
        }
    }
}
