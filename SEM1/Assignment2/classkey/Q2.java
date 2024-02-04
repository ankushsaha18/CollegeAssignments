package classkey;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance:");
		double dist=sc.nextDouble();
		double m=dist*1000;
		double ft=dist*3280.8399;
		double inch=dist*39370.0787;
		double cm=dist*100000;
		System.out.println(dist+" km is "+m+" in metres");
		System.out.println(dist+" km is "+ft+" in feet");
		System.out.println(dist+" km is "+inch+" in inches");
		System.out.println(dist+" km is "+cm+" in centimetres");
	}

}
