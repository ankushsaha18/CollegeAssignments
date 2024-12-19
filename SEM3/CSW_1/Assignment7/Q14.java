import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = findHCF(a,b);
        int lcm = findLCM(a,b);
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
    public static int findHCF(int a,int b){
        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a,int b){
        int ans = (a>b)? a:b;
        while (true){
            if(ans%a == 0 && ans%b == 0){
                break;
            }
            ans++;
        }
        return ans;
    }
}
