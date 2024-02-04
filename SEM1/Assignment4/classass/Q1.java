package classass;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int f=sc.nextInt();
		System.out.print("Enter second number:");
		int s=sc.nextInt();
		System.out.print("Enter third number:");
		int t=sc.nextInt();
		int sum=0;
		for(int i=f;i<=s;i+=t) {
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println("\nSum of the numbers are="+sum);
		
	}

}
