public class Q1c {
    public static void main(String[] args) {
        int x = 4, y = -8;
        if (++x < (y = y -= 7) || (x = x + 14) > y) {
            System.out.println(x + "," + y);
        } else {
            System.out.println((x - y) + "," + (y - x));
        }
    }
}
