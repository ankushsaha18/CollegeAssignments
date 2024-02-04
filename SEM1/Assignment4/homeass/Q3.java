package homeass;

public class Q3 {

	public static void main(String[] args) {
        int count = 0;

        for (int i = 1000; i < 2000; i++) {
            if (count == 5) {
                System.out.println();
                count = 0;
            }

            System.out.print(i + " ");
            count++;
        }
    }

}
