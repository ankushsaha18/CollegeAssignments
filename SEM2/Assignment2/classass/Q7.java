package classass;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 obj=new Person3();
		obj.name="Ankush";
		obj.display();
		System.out.println("Number of letters:"+obj.count());
	}

}
interface DetailInfo{
	void display();
	int count();	
}
class Person3 implements DetailInfo{
	static int maxCount;
	String name;
	public void display() {
		System.out.println("Name is:"+name);
	}
	public int count() {
		return name.length();
	}
}
