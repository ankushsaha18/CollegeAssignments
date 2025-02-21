package Assignment1.Q7;

public class Book extends LibraryResource{
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void displayDetails(){
        System.out.println("Book Title: " + this.getTitle());
        System.out.println("Book Author: " + this.getAuthor());
        System.out.println("Page Count: " + this.pageCount);
    }
}
