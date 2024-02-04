package classkey;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit:");
		double fah=sc.nextDouble();
		double cel=(fah-32)*5/9;
		System.out.println(fah+" in celcius is:"+cel);
	}

}
