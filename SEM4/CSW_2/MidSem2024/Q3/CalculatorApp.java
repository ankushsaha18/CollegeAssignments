package MidSem2024.Q3;

import java.util.Scanner;

class MyArithmeticException extends Exception{
    public MyArithmeticException(String message){
        super(message);
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            if(a < b){
                throw new MyArithmeticException("First number is smaller than second");
            }
            System.out.println("Addition = " + (a+b));
            System.out.println("Subtraction = " + (a-b));
            System.out.println("Multiplication = " + (a*b));
            if(b == 0){
                throw new MyArithmeticException("Cannot Divide by zero");
            }
            System.out.println("Division = " + (a/b));
        }catch (MyArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
