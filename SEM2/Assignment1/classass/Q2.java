package classass;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter person weight in kg: ");
		double w=sc.nextDouble();
		System.out.print("Enter height person in meter: ");
		double h=sc.nextDouble();
		double bmi=w/(h*h);
		if(bmi<18.5) {
			System.out.println("The person is Underweight");
		}else if(bmi>=18.5 && bmi<25) {
			System.out.println("The person is Normal Weight");
		}else if(bmi>=25 && bmi<30) {
			System.out.println("The person is Overweight");
		}else {
			System.out.println("The person is Obese");
		}
	}

}
