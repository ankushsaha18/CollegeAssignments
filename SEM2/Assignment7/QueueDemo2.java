import java.util.Scanner;

class Node{
    int info;
    Node next;
}

public class QueueDemo2 {
    public static Node insert (Node rear, Node front){
        Node p = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter info:");
        p.info = sc.nextInt();
        if(rear == null){
            front = rear = p;
        } else {
            rear.next = p;
            rear = p;
        }
        return rear;
    }

    public static Node delete (Node rear, Node front) {
        if(front == null){
            System.out.println("Queue is empty");
            return null;
        }
        System.out.println("Deleted Node --> " + front.info);
        front = front.next;
        return front;
    }

    public static void display (Node rear, Node front){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.println("Queue is ---");
        while (temp != null){
            System.out.print(temp.info + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;

        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    rear = insert(rear, front);
                    if (front == null) {
                        front = rear;
                    }
                    break;
                case 2:
                    front = delete(rear, front);
                    break;
                case 3:
                    display(rear, front);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
