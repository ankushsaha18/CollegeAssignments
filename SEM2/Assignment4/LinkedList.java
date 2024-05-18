import java.util.*;
class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}

public class LinkedList {

    public static Node create(Node start) {
        Scanner sc=new Scanner(System.in);
        Node p;
        Node q = null;
        char ch;
        do {
            p=new Node();
            System.out.print("Enter registration number: ");
            p.regd_no=sc.nextInt();
            System.out.print("Enter marks number: ");
            p.mark=sc.nextInt();
            p.next=null;
            if(start == null) {
                start = p;
            }
            else {
                q.next=p;
            }
            q = p;
            System.out.print("Do you want to create more number of nodes(y/n)? :");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        return start;
    }

    public static void display(Node start) {
        Node p=start;
        if(start == null) {
            System.out.println("Empty linked list");
        }
        else {
            System.out.println("*******Node details********* \nReg.no --- marks");
            while(p!=null) {
                System.out.println(p.regd_no+"---------"+p.mark);
                p = p.next;
            }
        }
    }

    public static Node InsBeg(Node start) {
        Scanner sc=new Scanner(System.in);
        Node p=new Node();
        System.out.print("Enter registration number: ");
        p.regd_no=sc.nextInt();
        System.out.print("Enter marks: ");
        p.mark=sc.nextInt();
        p.next = start;
        start = p;
        return start;
    }

    public static Node InsEnd(Node start) {
        Scanner sc=new Scanner(System.in);
        Node p=new Node();
        System.out.print("Enter registration number: ");
        p.regd_no=sc.nextInt();
        System.out.print("Enter marks number: ");
        p.mark=sc.nextInt();
        p.next = null;
        if(start == null) {
            start = p;
        }
        else {
            Node q = start;
            while(q.next!=null) {
                q = q.next;
            }
            q.next = p;
        }
        return start;
    }
    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        Node p = new Node();
        System.out.print("Enter the registration number of new node: ");
        p.regd_no = sc.nextInt();
        System.out.print("Enter the roll number of node: ");
        p.mark = sc.nextFloat();
        System.out.print("Enter position of new node: ");
        int pos = sc.nextInt();
        if(pos <= 0) {
            System.out.println("Position does not exit in LinkedList");
        }
        else if(start == null || pos == 1) {
            p.next = start;
            start = p;
            System.out.println("Node added at first position");
        } else {
            Node q = start;
            for(int i = 1 ; i < pos - 1 && q.next != null ; i++) {
                q = q.next;
            }
            if(q.next == null){
                q.next = p;
            }else{
                p.next = q.next;
                q.next = p;
                System.out.println("New node added at " + pos + " position");
            }
        }
        return start;
    }

    public static Node DelBeg(Node start) {
        if(start == null) {
            System.out.println("Empty LinkedList");
        } else {
            Node p = start;
            start = start.next;
            System.out.println("Deleted node information\nReg.no --- marks");
            System.out.println(p.regd_no+"---------"+p.mark);
        }
        return start;
    }
    public static Node DelEnd(Node start) {
        if(start==null) {
            System.out.println("Empty LinkedList");
        }
        else {
            Node p = start;
            while(p.next.next != null) {
                p = p.next;
            }
            p.next = null;
            System.out.println("Deleted node information\nReg.no --- marks");
            System.out.println(p.regd_no+"---------"+p.mark);
        }
        return start;
    }

    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position of deleted node: ");
        int pos = sc.nextInt();
        if(start == null) {
            System.out.println("Empty LinkedList, deletion not possible");
        } else if(pos == 1) {
            Node q = start;
            start = start.next;
            System.out.println("Deleted node info-- registration no: "+q.regd_no+" and mark: "+q.mark);
        } else {
            Node p = start;
            for(int i = 1 ; i < pos - 1 && p.next.next != null ; i++) {
                p = p.next;
            }
            System.out.println("Deleted node info-- registration no: " + p.next.regd_no + " and mark: " + p.next.mark);
            p.next = p.next.next;
        }
        return start;
    }

    public static void search(Node start) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter regd_no to search:");
        int regNo = sc.nextInt();
        if(start==null) {
            System.out.println("Empty LinkedList");
        } else {
            Node p = start;
            while(p != null) {
                if(p.regd_no == regNo) {
                    System.out.println("Registration found, Enter the updated marks");
                    p.mark = sc.nextInt();
                }
                p = p.next;
            }
            System.out.println("Marks updated");
        }
    }

    public static int count(Node start) {
        int cnt = 0;
        Node p = start;
        while(p != null) {
            cnt++;
            p = p.next;
        }
        return cnt;
    }
    public static Node reverse(Node start) {
        Node curr = start;
        Node prev = null;
        while (curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        start = prev;
        System.out.println("LinkedList reversed");
        return start;
    }

    public static void sort(Node start) {
        if(start == null || start.next == null){
            System.out.println("LinkedList is already sorted");
            return;
        }
        Node curr;
        boolean swapped;
        Node tail = null;
        do{
            swapped = false;
            curr = start;
            while (curr.next != tail){
                if(curr.mark > curr.next.mark){
                    int temp_regd = curr.regd_no;
                    float tempMark = curr.mark;
                    curr.regd_no = curr.next.regd_no;
                    curr.mark = curr.next.mark;
                    curr.next.regd_no = temp_regd;
                    curr.next.mark = tempMark;
                    swapped = true;
                }
                curr = curr.next;
            }
            tail = curr;
        }while (swapped);
        System.out.println("LinkedList Sorted");
    }

    public static void main(String[] args) {
        Node start = null;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("\n****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insert new node at the beginning");
            System.out.println("4:Insert new node at the end");
            System.out.println("5:Insert new node at any position");
            System.out.println("6:Delete a new node from first");
            System.out.println("7:Delete a new node from last");
            System.out.println("7:Delete a new node from any position");
            System.out.println("9:Update marks based on registration no.");
            System.out.println("10:Count of LinkedList");
            System.out.println("11:Sort the LinkedList based on marks");
            System.out.println("12:Reverse the LinkedList");
            System.out.print("Enter the choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    start = create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    System.out.println("Number of Students: " + count(start));
                    break;
                case 11:
                    sort(start);
                    break;
                case 12:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

