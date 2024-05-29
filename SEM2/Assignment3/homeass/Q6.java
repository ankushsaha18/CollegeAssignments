package homeass;

public class Q6 {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str,0,str.length() - 1));
    }
    public static boolean isPalindrome(String str,int s,int e){
        if(s == e){
            return true;
        }
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        return isPalindrome(str,s + 1 ,e - 1);
    }
}
