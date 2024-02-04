package classass;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=in.nextInt();
		int rnum=0;
		System.out.print(num+" and ");
		boolean istprime=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				istprime=false;
				break;
			}
		}
		while(num>0) {
			rnum=rnum*10+num%10;
			num/=10;
		}
		for(int i=2;i<=Math.sqrt(rnum);i++) {
			if(rnum%i==0) {
				istprime=false;
				break;
			}
		}
		if(istprime) {
			System.out.println(rnum+" are twisted prime");
		}else {
			System.out.println(rnum+" are not twisted prime");
		}
	}
}
