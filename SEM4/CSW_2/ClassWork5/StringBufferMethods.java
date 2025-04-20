package ClassWork5;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("ITER College BBSR Odisha");
        sb.setLength(4);
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
