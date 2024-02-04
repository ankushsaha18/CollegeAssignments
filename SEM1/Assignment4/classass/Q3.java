package classass;
import java.util.Scanner;
public class Q3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number:");
	int N=sc.nextInt();
	int count=0;
	int sum=0;
	do {
		int temp=((int)(Math.random()*N)+1);
		System.out.print(temp+" ");
		sum+=temp;
		count++;
	}while(count<N);
	System.out.println("\nAverage of the numbers are="+(float)(sum/N));
}

}
