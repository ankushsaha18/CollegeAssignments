package classkey;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your digit between 0 to 1000:");
		int num=sc.nextInt();
		if(num>1000 || num<0) {
			System.out.println("Enter number in range");
		}else {
			int sum=0;
			while(num>0) {
				int temp=num%10;
				sum+=temp;
				num/=10;
				}
			System.out.println("The sum of the digits is:"+sum);
		}
	}

}
