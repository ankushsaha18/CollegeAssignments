package Q8a;
import Q8b.Sports;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandTotal obj=new grandTotal();
		obj.input();
		obj.output();
	}

}
class Student{
	String name;
	int roll;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter roll:");
		roll=sc.nextInt();
	}
	void output() {
		System.out.print("Name is "+name+" having roll number "+roll);
	}
}
class Test extends Student{
	int mark1;
	int mark2;
	void input() {
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter mark1:");
		mark1=sc.nextInt();
		System.out.print("Enter mark2:");
		mark2=sc.nextInt();
	}
	void output() {
		super.output();
		System.out.print(" secured Mark1:"+mark1+" and Mark2:"+mark2);
	}
}
class grandTotal extends Test implements Sports {
	void input() {
		super.input();
		
	}
	void output() {
		super.output();
		System.out.println(" and having Score1:"+score1+" and Score2:"+score2);
		System.out.println("Total Marks:"+(mark1+mark2));
		System.out.println("Total Score:"+(score1+score2));
		System.out.println("Grand Total:"+(mark1+mark2+score1+score2));
	}
}
