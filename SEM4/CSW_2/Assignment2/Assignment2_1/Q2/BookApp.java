package Assignment2.Assignment2_1.Q2;

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book(11,"CSW",871.40);
        Book b2 = new Book(7,"AD",751.33);
        Book b3 = new Book(11,"CSW",871.40);
        System.out.println("Book 1 --> " + b1);
        System.out.println("Book 2 --> " + b2);
        System.out.println("Book 3 --> " + b3);
        if(b1.compareTo(b2) > 0){
            System.out.println("Book 1 is more expensive");
        }else if(b1.compareTo(b2) < 0){
            System.out.println("Book 2 is more expensive");
        }else{
            System.out.println("Both books have same price");
        }
        System.out.println(b1.equals(b3));
    }
}
