package ClassWork3;

import java.util.Scanner;

class AgeTest extends RuntimeException{
    public AgeTest(String message){
        super(message);
    }
}
public class OwnException {
    public static void main(String[] args) {
        System.out.print("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18){
            try {
                throw new AgeTest("Not allowed to vote");
            }catch (AgeTest e){
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Enrolled in voters list");
        }
    }
}
