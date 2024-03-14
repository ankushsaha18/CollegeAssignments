package classass;

public class Q4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = { 'C', 'A', 'R' };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    for (int k = 0; k < arr.length; k++) {
                        if (j != k && i != k) {
                            System.out.print(arr[i]);
                            System.out.print(arr[j]);
                            System.out.print(arr[k]);
                            System.out.println();
                        }
                    }
                }
            }
        }
	}
}
