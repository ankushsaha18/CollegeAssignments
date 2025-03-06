package Assignment1.Q7;

public class Magazine extends LibraryResource{
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void displayDetails(){
        System.out.println("Magazine Title: " + this.getTitle());
        System.out.println("Magazine Author: " + this.getAuthor());
        System.out.println("Issue Date: " + this.issueDate);
    }
}
