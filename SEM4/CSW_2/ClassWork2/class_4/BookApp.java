package com.Ankush;

public class BookApp {
    public static void main(String[] args) {
        BookOperation bo = new BookOperation();
        bo.addBook(new Book(101,"CSW","X"));
        bo.addBook(new Book(102,"AD","Y"));
        Student s = new Student(51,"Ankush");
        Student s2 = new Student(69,"Smith");
        bo.issueBook(s,new Book(101,"CSW","X"));
        bo.issueBook(s2,new Book(101,"CSW","X"));
        bo.viewIssuedBooks(s);
        bo.returnABook(s,new Book(101,"AD","X"));
        bo.viewIssuedBooks(s);
        bo.issueBook(s2,new Book(102,"AD","Y"));
        bo.viewAllIssuedBooks();
    }
}
