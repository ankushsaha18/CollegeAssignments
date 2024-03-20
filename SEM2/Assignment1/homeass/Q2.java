package homeass;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of lines:");
		int n=sc.nextInt();
		sc.nextLine();
		String lines[]=new String[n];
		System.out.println("Enter the lines---");
		for(int i=0;i<n;i++) {
			lines[i]=sc.nextLine();
		}
		System.out.println("Lines in reverse order are---");
		for(int i=lines.length-1;i>=0;i--) {
			System.out.println(lines[i]);
		}
	}

}
