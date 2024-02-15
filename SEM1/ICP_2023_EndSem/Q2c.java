public class Q2c {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Enter 3 Integers");
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int max = Math.max(a, Math.max(c, b));
            int min = Math.min(a, Math.min(c, b));
            System.out.println(min + " " + (a + b + c - max - min) + " " + max);
        }
    }
}
