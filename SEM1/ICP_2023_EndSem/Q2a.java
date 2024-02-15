public class Q2a {
    public static void main(String[] args) {
        int a[] = new int[5];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + i * 2;
            sum = sum + a[i];
            System.out.println(a[i]);
        }
        System.out.println(sum);
    }
}
