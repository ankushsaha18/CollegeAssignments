package Lab3;

public class DecimalToHexa {
    public static void main(String[] args) {
        int n = 87459;
        System.out.println(decToHex(n));
    }
    public static String decToHex(int n){
        if(n == 0) {
            return "";
        }
        String hex = "0123456789ABCDEF";
        return decToHex(n/16)+hex.charAt(n%16);
    }
}
