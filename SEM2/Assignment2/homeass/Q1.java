package homeass;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Sales Amount:");
		double sales=sc.nextDouble();
		Commision com=new Commision(sales);
		System.out.println("Commission Amount is:"+com.getCommision());
	}

}
class Commision{
	double sales;
	Commision(double sales){
		this.sales=sales;
	}
	double getCommision() {
		if(sales<0) {
			System.out.println("Invalid Input");
			return 0;
		}else if(sales<=100) {
			return 0.02*sales;
		}else if(sales<=5000) {
			return 0.05*sales;
		}else {
			return 0.08*sales;
		}
	}
}
