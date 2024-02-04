package classkey;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary:");
		double salary=sc.nextDouble();
		double da=0.4*salary;
		double hra=0.2*salary;
		double gross=salary+da+hra;
		
		System.out.println("DA is:"+da);
		System.out.println("HRA is:"+hra);
		System.out.println("Gross Salary is:"+ gross);

	}

}
