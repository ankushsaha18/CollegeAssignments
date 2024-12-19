import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Operation:");
        String op = sc.next();
        int index = -1; // index of operator in operation
        char operator = '\u0000';
        for(int i = 0 ; i < op.length() ; i++){
            char c = op.charAt(i);
            if(c == '+' || c == '-' || c == '*' || c == '/'){
                operator = c;
                index = i;
                break;
            }
        }
        int a = Integer.parseInt(op.substring(0,index));
        int b = Integer.parseInt(op.substring(index+1));
        switch (operator){
            case '+':
                System.out.println("Sum = " + (a+b));
                break;
            case '-':
                System.out.println("Diff = "  + (a-b));
                break;
            case '*':
                System.out.println("Mul = " + (a*b));
                break;
            case '/':
                System.out.println("Div = " + (a/b));
                break;
        }
    }
}
