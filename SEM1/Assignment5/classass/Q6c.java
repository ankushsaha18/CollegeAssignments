package classass;

public class Q6c {
	public static void main(String[] args) {
        int row = 5;
        int c = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c++ + " ");
            }

            System.out.println();
        }
    }
}
