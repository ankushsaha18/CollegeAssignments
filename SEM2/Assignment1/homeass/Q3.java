package homeass;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.print("Enter 1st array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter 2nd array:");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int c[]=dotProduct(a,b);
		System.out.println("Dot product is: "+Arrays.toString(c));
	}
	static int[] dotProduct(int a[],int b[]) {
		int ans[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			ans[i]=a[i]*b[i];
		}
		return ans;
	}
}
