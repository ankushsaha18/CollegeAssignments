public class Q4a {
    public static void main(String[] args) {
        String s = "HELEN";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'H':
                    ans += "3";
                    break;
                case 'O':
                    ans += "5";
                    break;
                case 'U':
                    ans += "8";
                    break;
                case 'S':
                    ans += "4";
                    break;
                case 'E':
                    ans += "2";
                    break;
                case 'L':
                    ans += "1";
                    break;
                case 'M':
                    ans += "6";
                    break;
                case 'N':
                    ans += "9";
                    break;
                default:
                    break;
            }
        }
        System.out.println(ans);
    }
}
