package classass;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.print("Enter elements of 2D-Array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements of 2D array are:");
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is "+sum(arr));
	}
	static int sum(int arr[][]) {
		int ans=0;
		for(int i[]:arr) {
			for(int j:i) {
				ans+=j;
			}
		}
		return ans;
	}

}
