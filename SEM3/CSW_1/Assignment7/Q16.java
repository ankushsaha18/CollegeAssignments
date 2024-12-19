import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter numbers or else type exit---");
        while (true){
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                if(num > largest){
                    largest = num;
                }
                if(num < smallest){
                    smallest = num;
                }
            }else {
                break;
            }
        }
        System.out.println("Smallest value = " + smallest);
        System.out.println("Largest value  = " + largest);
    }
}
