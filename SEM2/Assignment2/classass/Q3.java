package classass;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product bill[]=new Product[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter Product Id,price and quantity: ");
			int pid=sc.nextInt();
			double price=sc.nextDouble();
			int qty=sc.nextInt();
			bill[i]=new Product(pid,price,qty);
		}
		System.out.println("PID\tPrice\tQuantity");
		for(Product i:bill) {
			i.display();
		}
		System.out.println("Your total bill is: Rs."+Product.totalPrice);
	}

}
class Product{
	int PID;
	double price;
	int qty;
	static double totalPrice;
	Product(int PID,double price,int qty){
		this.PID=PID;
		this.price=price;
		this.qty=qty;
		totalPrice += this.price * this.qty;
	}
	void display() {

		System.out.println(PID+"\t"+price+"\t   "+qty);
	}
}
