package Assignment2.Assignment2_2.Q6;

import java.util.Scanner;
import java.util.TreeSet;

public class TS {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        ts.add(20);
        ts.add(80);
        ts.add(75);
        ts.add(12);
        System.out.println(ts);
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        if(ts.contains(75)){
            System.out.println(search + " exists");
        }else {
            System.out.println(search + " does not exist");
        }
        System.out.print("Enter number to remove: ");
        int remove = sc.nextInt();
        ts.remove(remove);
        System.out.println("After removing ---");
        System.out.println(ts);
    }
}
