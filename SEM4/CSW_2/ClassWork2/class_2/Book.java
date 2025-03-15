package ClassWork2.class_2;

public class Book {
    private String bookTitle;
    private int id;
    private String bookAuthor;

    public Book(String bookTitle, int id, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.id = id;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return this.id + " " + this.bookTitle + " " + this.bookAuthor;
    }
}
