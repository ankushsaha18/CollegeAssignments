import java.util.Scanner;

public class QueueDemo1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static void insert(int[] Q){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element to insert:");
            int x = sc.nextInt();
            if(rear == -1){
                front = rear = 0;
            }else {
                rear = (rear + 1) % MAX;
            }
            Q[rear] = x;
        }
    }

    public static void delete(int[] Q){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            int deleted = Q[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1) % MAX;
            }
            System.out.println("Deleted Element is:" + deleted);
        }
    }

    public static void display(int[] Q){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else {
            System.out.print("Queue is ---> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(Q[i] + " ");
            }
        }
    }

    public static boolean isFull(){
        return rear == MAX - 1;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q[] = new int[MAX];

        while (true) {
            System.out.println("\n***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    insert(Q);
                    break;
                case 2:
                    delete(Q);
                    break;
                case 3:
                    display(Q);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
