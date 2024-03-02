package classass;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Sum of digits of "+n+" until the number is single digit is "+sum_Of_Digits(n));
	}
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while(n>0 || sum/10>0) {
			if(n==0) {
				n=sum;
				sum=0;
			}else {
				sum+=n%10;
				n/=10;
			}
		}
		return sum;
	}

}
