package classass;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ob1=new Person();
		ob1.name="Rohan";
		ob1.age=20;
		ob1.displayData();
		Person ob2=new Person();
		ob2.setData();
		ob2.displayData();
		if(ob1.age<ob2.age) {
			System.out.println(ob1.name+" is younger than "+ob2.name);
		}else {
			System.out.println(ob2.name+" is younger than "+ob1.name);
		}
	}

}
class Person{
	String name;
	int age;
	void setData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter age:");
		age=sc.nextInt();
	}
	void displayData() {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
}
