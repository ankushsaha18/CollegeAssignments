package classkey;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of seconds:");
		double time=sc.nextDouble();
		double dis=1/2*32.174*time*time;
		System.out.println("Distance travelled:"+dis);

	}

}
