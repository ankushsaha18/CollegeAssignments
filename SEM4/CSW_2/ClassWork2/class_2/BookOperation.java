package ClassWork2.class_2;

import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class BookOperation {
    private TreeSet<Book> books;
    private Stack<Book> issueBooks;

    public BookOperation(){
        this.books = new TreeSet<>();
        this.issueBooks = new Stack<Book>();
    }

    public void addBook(Book b){
        this.books.add(b);
        System.out.println("Book added " + b.getBookTitle());
    }

    public void removeBook(int id){
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            Book current = itr.next();
            if(current.getId() == id){
                itr.remove();
                System.out.println("Book with id " + id + " removed successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void displayAllBooks(){
        System.out.println("Displaying all the books ---");
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            Book current = itr.next();
            System.out.println(current);
        }
    }

    public void issueBook(int id){
        if(books.isEmpty()){
            System.out.println("No Books present");
            return;
        }
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            Book current = itr.next();
            if(current.getId() == id){
                itr.remove();
                this.issueBooks.add(current);
                System.out.println("Book issued successfully with id " + id);
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void displayAllIssueBooks(){
        if(issueBooks.isEmpty()){
            System.out.println("No Books issued");
            return;
        }
        System.out.println("Displaying all issued books ---");
        Iterator<Book> itr = issueBooks.iterator();
        while (itr.hasNext()){
            Book current = itr.next();
            System.out.println(current);
        }
    }

    public void returnLastIssuedBook(){
        if(issueBooks.isEmpty()){
            System.out.println("No issued Books");
            return;
        }
        books.add(issueBooks.pop());
        System.out.println("Last issued book returned successfully");
    }

    public void viewLastIssuedBook(){
        if(issueBooks.isEmpty()){
            System.out.println("No issued Books");
            return;
        }
        System.out.println("Last issued book is: " + issueBooks.peek());
    }

    public Book searchBookWithId (int id){
        if(books.isEmpty() && issueBooks.isEmpty()){
            System.out.println("No Books available");
            return null;
        }
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            Book current = itr.next();
            if(current.getId() == id){
                System.out.println("Book found successfully");
                return current;
            }
        }
        itr = issueBooks.iterator();
        while (itr.hasNext()){
            Book current = itr.next();
            if(current.getId() == id){
                System.out.println("Book found successfully");
                return current;
            }
        }
        System.out.println("Book not found");
        return null;
    }
}
