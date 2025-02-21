package Assignment1.Q7;

public abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayDetails();
}
