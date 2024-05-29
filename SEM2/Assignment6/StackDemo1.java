import java.util.Scanner;

public class StackDemo1 {
    public static final int MAX = 10;

    public static int push(int[] S,int top){
        if(isFull(top)){
            System.out.println("Stack Overflow");
            return top;
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element to push:");
            int x = sc.nextInt();
            S[++ top] = x;
            System.out.println("Element " + x + " pushed into Stack");
            return top;
        }
    }

    public static int pop(int[] S,int top){
        if( isEmpty(top)){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return S[top --];
        }
    }

    public static void display(int[] S,int top){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack is ---> ");
            for(int i = top ; i >= 0 ; i--){
                System.out.print(S[i] + " ");
            }
        }
    }

    public static boolean isEmpty(int top){
        return top == -1;
    }

    public static boolean isFull(int top){
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(stack, top);
                    break;
                case 2:
                    int popped = pop(stack, top);
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                        top--;
                    }
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
