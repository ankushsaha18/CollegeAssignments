package classass;

public class Q4 {
	
	public static void main(String[] args) {
        char arr[] = { 'c', 'a', 'r', 'b', 'o', 'n' };
        recPermute(0, arr);
    }

    static void recPermute(int index, char arr[]) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            recPermute(index + 1, arr);
            swap(index, i, arr);
        }
    }

    static void swap(int i, int j, char arr[]) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
