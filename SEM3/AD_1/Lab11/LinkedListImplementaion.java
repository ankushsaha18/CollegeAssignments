package Lab11;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImplementaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while (true){
            System.out.println("Menu---");
            System.out.println("1.Insert at beginning");
            System.out.println("2.Insert at end");
            System.out.println("3.Insert at any position");
            System.out.println("4.Delete from beginning");
            System.out.println("5.Display the LinkedList");
            System.out.println("6.Exit");
            System.out.print("Enter your choice:");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.print("Enter element to insert:");
                    int x1 = sc.nextInt();
                    list.addFirst(x1);
                    System.out.println(x1 + " added successfully at first position");
                    break;
                case 2:
                    System.out.print("Enter element to insert:");
                    int x2 = sc.nextInt();
                    list.addLast(x2);
                    System.out.println(x2 + " added successfully at last position");
                    break;
                case 3 :
                    System.out.print("Enter element to insert:");
                    int x3 = sc.nextInt();
                    System.out.print("Enter position to insert:");
                    int p = sc.nextInt();
                    list.add(p-1,x3);
                    System.out.println(x3 + " added successfully at position " + p);
                    break;
                case 4:
                    int deleted = list.remove();
                    System.out.println(deleted + " deleted from first position");
                    break;
                case 5:
                    System.out.println("LinkedList elements :" + list);
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
