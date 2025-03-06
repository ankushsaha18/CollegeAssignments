package Assignment1.Q7;

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("Atomic Habits","James Clear",420);
        Magazine m = new Magazine("The Forbes","Randall Lane","20/01/2025");
        DVD d = new DVD("University Lectures","ITER",1020);
        b.displayDetails();
        m.displayDetails();
        d.displayDetails();
    }
}
