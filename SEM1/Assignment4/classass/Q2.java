package classass;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		System.out.print(num);
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		if(sum%9==0) {
			System.out.println(" is divisible by 9");
		}else {
			System.out.println(" is not divisible by 9");
		}
		
	}

}
