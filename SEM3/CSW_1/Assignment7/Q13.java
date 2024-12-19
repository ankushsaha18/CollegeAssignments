import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Number must be positive");
        }else{
            System.out.println("Multiplication table of " + n);
            for (int i = 1 ; i <= 10 ; i++){
                System.out.println(n + " X " + i + " = " + (n*i));
            }
        }
    }
}
