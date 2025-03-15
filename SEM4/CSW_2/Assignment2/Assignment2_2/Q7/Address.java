package Assignment2.Assignment2_2.Q7;

public class Address {
    private int plotNo;
    private String post;

    public Address(int plotNo, String post) {
        this.plotNo = plotNo;
        this.post = post;
    }

    public String toString(){
        return plotNo + " " + post;
    }
}
