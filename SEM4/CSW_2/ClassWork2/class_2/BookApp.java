package ClassWork2.class_2;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookOperation bo = new BookOperation();
        System.out.println("Menu ---");
        System.out.println("1. Add a book");
        System.out.println("2. Remove a book");
        System.out.println("3. Display all books");
        System.out.println("4. Issue a book");
        System.out.println("5. Display all issued books");
        System.out.println("6. Return Last issued book");
        System.out.println("7. View last issued book");
        System.out.println("8. Search a book");
        System.out.println("9. Exit");
        char ch = 'y';
        while (ch == 'y' || ch == 'Y'){
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("Enter book details ---> ");
                    int bookId = sc.nextInt();
                    String bookTitle = sc.next();
                    String bookAuthor = sc.next();
                    bo.addBook(new Book(bookTitle,bookId,bookAuthor));
                    break;
                case 2:
                    System.out.print("Enter book id to remove: ");
                    int id = sc.nextInt();
                    bo.removeBook(id);
                    break;
                case 3:
                    bo.displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter book id to issue: ");
                    id = sc.nextInt();
                    bo.issueBook(id);
                    break;
                case 5:
                    bo.displayAllIssueBooks();
                    break;
                case 6:
                    bo.returnLastIssuedBook();
                    break;
                case 7:
                    bo.viewLastIssuedBook();
                    break;
                case 8:
                    System.out.print("Enter book id to search: ");
                    id = sc.nextInt();
                    System.out.println(bo.searchBookWithId(id));
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice");
            }
            System.out.print("Press Y to continue:");
            ch = sc.next().charAt(0);
        }
    }
}
