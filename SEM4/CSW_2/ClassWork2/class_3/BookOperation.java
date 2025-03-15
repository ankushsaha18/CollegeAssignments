package ClassWork2.class_3;

import java.util.*;

public class BookOperation {
    private ArrayList<Book> library;
    private TreeMap<Student,ArrayList<Book>> issuedBooks;

    public BookOperation() {
        this.library = new ArrayList<>();
        this.issuedBooks = new TreeMap<>();
    }

    public void addBook(Book b){
        library.add(b);
        System.out.println("Book added: " + b);
    }

    public void issueBook(Student s,Book b){
        if(library.isEmpty()){
            System.out.println("No Books");
            return;
        }
        if(!library.contains(b)){
            System.out.println("Book " + b + " is not present");
            return;
        }
        if(!issuedBooks.containsKey(s)){
            issuedBooks.put(s,new ArrayList<>());
        }
        Iterator<Book> itr = library.iterator();
        while (itr.hasNext()){
            Book b2 = itr.next();
            if(b2.equals(b)){
                issuedBooks.get(s).add(b2);
                itr.remove();
                break;
            }
        }
        System.out.println("Book " + b + " issued by Student " + s);
    }
    public void viewIssuedBooks(Student s){
        if(issuedBooks.get(s).isEmpty() || !issuedBooks.containsKey(s)){
            System.out.println("No Issued Books");
            return;
        }
        System.out.println("Issued Books are --- ");
        for (Book b : issuedBooks.get(s)){
            System.out.println(b);
        }
    }
    public void returnABook(Student s,Book b){
        if(issuedBooks.isEmpty() || !issuedBooks.containsKey(s) || !issuedBooks.get(s).contains(b)){
            System.out.println("Book not issued for return");
            return;
        }
        library.add(b);
        Iterator<Book> itr = issuedBooks.get(s).iterator();
        while (itr.hasNext()){
            if(itr.next().equals(b)){
                itr.remove();
                break;
            }
        }
        System.out.println("Book " + b + " returned by Student " + s);
    }
    public void viewAllIssuedBooks(){
        if(issuedBooks.isEmpty()){
            System.out.println("No Books issued yet");
            return;
        }
        System.out.println("All Issued books are ---");
        Iterator<Map.Entry<Student,ArrayList<Book>>> itr = issuedBooks.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Student,ArrayList<Book>> entry = itr.next();
            if(!entry.getValue().isEmpty()){
                System.out.println("Issued books by Student " + entry.getKey() + " are ---");
                for(Book b : entry.getValue()){
                    System.out.println(b);
                }
            }
        }
    }
}