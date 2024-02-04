package homekey;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1:");
		double x1=sc.nextDouble();
		System.out.print("Enter y1:");
		double y1=sc.nextDouble();
		System.out.print("Enter x2:");
		double x2=sc.nextDouble();
		System.out.print("Enter y2:");
		double y2=sc.nextDouble();
		System.out.print("Enter x3:");
		double x3=sc.nextDouble();
		System.out.print("Enter y3:");
		double y3=sc.nextDouble();
		double s1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		double s2=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2, 2));
		double s3=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3, 2));
		double s=(s1+s2+s3)/2;
		float area=(float)Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area of the triangle is:"+area);
		}
}
