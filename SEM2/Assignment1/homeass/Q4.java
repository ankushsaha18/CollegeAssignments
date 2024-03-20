package homeass;
import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		double a[][]= {{1,2,3.9},{3,4,5},{4,5,6}};
		double b[][]= {{5,6,7},{6,7,8},{6,7,8}};
		double add[][]=addMatrix(a,b);
		for(double i[]:add) {
			System.out.println(Arrays.toString(i));
		}
	}
	static double[][] addMatrix(double a[][],double b[][]) {
		double ans[][]=new double[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				ans[i][j]=a[i][j]+b[i][j];
			}
		}
		return ans;
	}
}