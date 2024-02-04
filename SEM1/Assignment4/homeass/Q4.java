package homeass;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter N:");
	int N=sc.nextInt();
	String s="(";
	String p="(";
	int sum=0;
	int product=1;
	for(int i=1;i<=N;i++) {
		if(i%2==0) {
			sum+=i;
			s+=i;
			if(i!=N  && i!=(N-1)) {
				s+=" + ";
			}
		}else {
			product*=i;
			p+=i;
			if(i!=N  && i!=(N-1)) {
				p+=" * ";
			}
	}
}
	System.out.println("Sum of all even numbers "+s+") = "+sum);
	System.out.println("Product of all odd numbers "+p+") = "+product);
	}
	}
