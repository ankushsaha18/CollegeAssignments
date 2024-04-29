public class Q1a {
    static int x= -55;
    public static void main(String[] args) {
        Q1a obj1 = new Q1a();
        obj1.x = obj1.x * 2 - 66;
        System.out.println(obj1.x);
        Q1a obj2 = new Q1a();
        obj2.x = obj2.x + 66;
        System.out.println(obj1.x + " " + obj2.x);
    }
    static{
        System.out.println(x);
    }
}
