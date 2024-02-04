package classass;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter amount of water Alice drank in ml:");
		int water=in.nextInt();
		if(water>=5000) {
			System.out.println("Yes, Alice is following doctor’s advice");
		}else {
			System.out.println("No, Alice is not following doctor’s advice");
		}
	}

}
