public class Q1b {
    public static void main(String[] args) {
        int i = 140;
        short s = 23;
        byte b = (byte) i;
        int x = b + s;
        System.out.println("Value of X is: " + x);
        x = x % 2 - 20;
        System.out.println("New value of X is: " + x);

    }
}
