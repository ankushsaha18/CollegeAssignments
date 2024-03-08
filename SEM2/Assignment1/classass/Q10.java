package classass;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		int row=3;
		int col=4;
		double m[][]=new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<col;i++) {
			System.out.println("Sum of the elements at column "+i+" is "+sumColumn(m,i));
		}
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double ans=0;
		for(int i=0;i<m.length;i++) {
			ans+=m[i][columnIndex];
		}
		return ans;
	}
}
