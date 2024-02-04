package classass;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number:");
		int first=in.nextInt();
		System.out.print("Enter second number:");
		int second=in.nextInt();
		System.out.print("Enter third number:");
		int third=in.nextInt();
		if(first<second && second<third) {
			System.out.println("Increasing");
		}else if(first>second && second>third){
			System.out.println("Decreasing");
			int a=4;
		}else {
			System.out.println("Neither Increasing nor Decreasing");
		}
				}

}
