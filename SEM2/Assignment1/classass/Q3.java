package classass;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		if(isSpy(n)) {
			System.out.println(n+" is a Spy number");
		}else {
			System.out.println(n+" is not a Spy number");
		}
	}
	public static boolean isSpy(int n) {
		int sum=0,pr=1;
		while(n>0) {
			sum+=n%10;
			pr*=n%10;
			n/=10;
		}
		return sum==pr;
	}

}
