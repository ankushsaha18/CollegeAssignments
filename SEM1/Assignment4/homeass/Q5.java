package homeass;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		System.out.print("Enter number of rows:");
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String temp = "";
        for (int i = 1; i <= n; i++) {
            temp=temp+i+temp;
            System.out.println(temp);
        }
    }
}
