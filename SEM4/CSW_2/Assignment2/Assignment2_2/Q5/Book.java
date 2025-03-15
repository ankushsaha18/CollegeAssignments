package Assignment2.Assignment2_2.Q5;

public class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return id + " " + name + " " + author + " " + quantity;
    }
}
