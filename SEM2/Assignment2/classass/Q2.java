package classass;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex o1=new Complex();
		System.out.println("Enter 1st complex number--");
		o1.setData();
		o1.display();
		Complex o2=new Complex();
		System.out.println("Enter 2nd complex number--");
		o2.setData();
		o2.display();
		Complex o3=new Complex().add(o1, o2);
		System.out.print("The sum is: ");
		o3.display();
	}

}
class Complex{
	int real;
	int imag;
	void setData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real part:");
		real=sc.nextInt();
		System.out.print("Enter imaginary part:");
		imag=sc.nextInt();
	}
	void display() {
		System.out.println("The complex number is: "+real+((imag<0)?"":"+")+imag+"i");
	}
	public Complex add(Complex o1,Complex o2) {
		Complex o3=new Complex();
		o3.real=o1.real+o2.real;
		o3.imag=o1.imag+o2.imag;
		return o3;
	}
}
