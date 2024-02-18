package classass;

public class Q7a {
	public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
