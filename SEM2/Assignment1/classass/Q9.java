package classass;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		int row=4;
		int col=4;
		double m[][]=new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
	}
	public static double sumMajorDiagonal(double[][] m) {
		double ans=0;
		for(int i=0;i<m.length;i++) {
			ans+=m[i][i];
		}
		return ans;
	}
}
