package Assignment1.Q7;

public class DVD extends LibraryResource{
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("Book Title: " + this.getTitle());
        System.out.println("Book Author: " + this.getAuthor());
        System.out.println("Duration: " + this.duration);
    }
}
