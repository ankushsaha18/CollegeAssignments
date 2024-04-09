package classass;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colors = new String[5];
        for(int i = 0 ; i < 5 ; i++) {
            System.out.print("Enter color:");
            colors[i] = sc.nextLine();
        }
        try {
            System.out.print("Enter One more color:");
            colors[5] = sc.nextLine();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        try{
            Integer.parseInt(colors[0]);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
