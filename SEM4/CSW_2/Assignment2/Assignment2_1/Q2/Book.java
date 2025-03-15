package Assignment2.Assignment2_1.Q2;

public class Book implements Comparable<Book>{
    private int bookId;
    private String bookName;
    private double price;

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return bookId + " " + bookName + " " + price;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Book b = (Book)obj;
        if((this.bookId == b.bookId) && (this.bookName.equals(b.bookName)) && (this.price == b.price)){
            return true;
        }
        return false;
    }

    public int compareTo(Book b){
        return Double.compare(this.price,b.getPrice());
    }
}
