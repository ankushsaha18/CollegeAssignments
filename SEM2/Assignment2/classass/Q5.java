package classass;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Rohit",25,1964,50000);
		Employee e2=new Employee("Virat",30,2205,100000);
		Employee e3=new Employee("Sam",21,5563,30000);
		System.out.println("Name\tAge\tEID\tSalary");
		e1.empDisplay();
		e2.empDisplay();
		e3.empDisplay();
	}

}
class Person2{
	String name;
	int age;
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person2{
	int Eid;
	double salary;
	Employee(String name,int age,int Eid,double salary){
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void empDisplay() {
		System.out.println(name+"\t"+age+"\t"+Eid+"\t"+salary);
	}
}