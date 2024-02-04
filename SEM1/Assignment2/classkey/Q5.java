package classkey;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the hemisphere:");
		double r=sc.nextDouble();
		double sa=3*Math.PI*(r*r);
		double v=2/3*Math.PI*(r*r*r);
		System.out.println("The surface area of the hemisphere is "+sa);
		System.out.println("The volume area of the hemisphere is "+v);

	}

}
