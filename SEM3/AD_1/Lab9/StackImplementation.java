package Lab9;

import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (true){
            System.out.println("Menu---");
            System.out.println("1.Push an element");
            System.out.println("2.Pop an element");
            System.out.println("3.Peek an element");
            System.out.println("4.Check if stack is empty");
            System.out.println("5.Display the stack");
            System.out.println("6.Exit");
            System.out.print("Enter your choice:");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.print("Enter element to push:");
                    int x = sc.nextInt();
                    stack.push(x);
                    System.out.println(x + " pushed successfully into the Stack");
                    break;
                case 2:
                    if(stack.isEmpty()){
                        System.out.println("Stack is empty,Cannot pop element");
                    }else{
                        int popped = stack.pop();
                        System.out.println("Popped element = " + popped);
                    }
                    break;
                case 3 :
                    if(stack.isEmpty()){
                        System.out.println("Stack is empty,Cannot peek");
                    }else{
                        System.out.println("Top element = " + stack.peek());
                    }
                    break;
                case 4:
                    if(stack.isEmpty()){
                        System.out.println("Stack is empty");
                    }else{
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    System.out.println("Stack elements :" + stack);
                    break;
                case 6:
                    System.out.println("Exiting.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
