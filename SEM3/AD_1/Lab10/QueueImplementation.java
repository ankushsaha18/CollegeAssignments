package Lab10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        while (true){
            System.out.println("Menu---");
            System.out.println("1.Enqueue an element");
            System.out.println("2.Dequeue an element");
            System.out.println("3.Peek an element");
            System.out.println("4.Check if Queue is empty");
            System.out.println("5.Display the Queue");
            System.out.println("6.Exit");
            System.out.print("Enter your choice:");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.print("Enter element to push:");
                    int x = sc.nextInt();
                    q.add(x);
                    System.out.println(x + " enqueued successfully into the Queue");
                    break;
                case 2:
                    if(q.isEmpty()){
                        System.out.println("Queue is empty,Cannot dequeue element");
                    }else{
                        int popped = q.poll();
                        System.out.println("Popped element = " + popped);
                    }
                    break;
                case 3 :
                    if(q.isEmpty()){
                        System.out.println("Queue is empty,Cannot peek");
                    }else{
                        System.out.println("Top element = " + q.peek());
                    }
                    break;
                case 4:
                    if(q.isEmpty()){
                        System.out.println("Queue is empty");
                    }else{
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 5:
                    System.out.println("Queue elements :" + q);
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
