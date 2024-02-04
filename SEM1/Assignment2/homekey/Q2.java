package homekey;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of eggs:");
		int eggs=sc.nextInt();
		int gross=eggs/144;
		int doz=eggs%144/12;
		int egg=eggs%144%12;
		System.out.println("Your number of eggs is "+gross+" gross "+doz+" dozens and "+egg);
		}
}
