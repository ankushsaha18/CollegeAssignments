package homeass;

import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		Random r=new Random();
		int m[][]=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				m[i][j]=r.nextInt(0,2);
			}
		}
		for(int i[]:m) {
			System.out.println(Arrays.toString(i));
		}
		int index=0,cnt=0;
		for(int i=0;i<m.length;i++) {
			if(rowCount(m,i)>cnt) {
				index=i;
				cnt=rowCount(m,i);
			}
		}
		System.out.println("The largest row index: "+index);
		cnt=0;
		index=0;
		for(int i=0;i<m.length;i++) {
			if(columnCount(m,i)>cnt) {
				index=i;
				cnt=columnCount(m,i);
			}
		}
		System.out.println("The largest column index: "+index);
	}
	static int columnCount(int m[][],int col) {
		int ans=0;
		for(int i=0;i<m.length;i++) {
			if(m[i][col]==1) {
				ans++;
			}
		}
		return ans;
	}
	static int rowCount(int m[][],int row) {
		int ans=0;
		for(int i=0;i<m.length;i++) {
			if(m[row][i]==1) {
				ans++;
			}
		}
		return ans;
	}
}
