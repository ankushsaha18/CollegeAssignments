package homekey;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time in minutes:");
		int min=sc.nextInt();
		int day=min/60/24;
		int yr=day/365;
		int days=day%365;
		System.out.println(min+" minutes is approximately "+yr+" years and "+days+" days");
		}
}
