import java.util.Scanner;

class Node{
    int info;
    Node next;
}

public class StackDemo2 {

    public static Node push(Node top){
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter info:");
        p.info = sc.nextInt();
        if(top == null){
            return p;
        }
        else{
            p.next = top;
            return p;
        }
    }

    public static Node pop(Node top){
        if(top == null){
            System.out.println("Stack Underflow");
            return null;
        }
        System.out.println("Popped Node ---> " + top.info);
        top = top.next;
        return top;
    }

    public static void display(Node top){
        Node temp = top;
        System.out.println("Stack is ---");
        while (temp != null){
            System.out.print(temp.info + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
