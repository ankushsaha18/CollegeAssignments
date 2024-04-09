package homeass;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Book[] bill = new Book[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter Book Name,Edition and Price:");
            String BName = sc.next();
            int BEdition = sc.nextInt();
            double BPrice = sc.nextDouble();
            bill[i]=new Book(BName,BEdition,BPrice);
        }
        Book max = bill[0];
        for(Book b : bill){
            if(b.BPrice > max.BPrice){
                max = b;
            }
        }
        System.out.println("Details of Book with maximum price-");
        System.out.println("Name\tEdition\tPrice");
        max.display();
    }
}
class Book{
    String BName;
    int BEdition;
    double BPrice;
    Book(String BName, int BEdition, double BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }
    void display(){
        System.out.println(BName+"\t"+BEdition+"\t"+BPrice);
    }
}
