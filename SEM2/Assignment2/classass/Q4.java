package classass;

public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit ob1=new Deposit(1000,2,3.5);
		ob1.calcAmt();
		ob1.display();
		Deposit ob2=new Deposit(1000,2);
		ob2.calcAmt();
		ob2.display();
	}

}
class Deposit{
	long principal;
	int time;
	double rate;
	double totalAmt;
	Deposit(){}
	Deposit(long principal,int time,double rate){
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long principal,int time){
		this.principal=principal;
		this.time=time;
	}
	Deposit(long principal,double rate){
		this.principal=principal;
		this.rate=rate;
	}
	void calcAmt() {
		totalAmt=principal+(principal*rate*time)/100;
	}
	void display() {
		System.out.println("Principal:"+principal);
		System.out.println("Rate:"+rate);
		System.out.println("Time:"+time);
		System.out.println("Total amount:"+totalAmt);
	}
}