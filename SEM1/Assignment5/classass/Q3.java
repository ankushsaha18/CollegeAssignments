package classass;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int f=sc.nextInt();
		System.out.print("Enter scond number:");
		int s=sc.nextInt();
		System.out.print("Prime numbers between "+f+" and "+s+" are : ");
		for(int i=f+1;i<s;i++) {
			boolean b=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					b=false;
					break;
				}
			}

			if(b) {
				System.out.print(i+" ");
			}
		}
	}

}
