public class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day,String month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }

    public int getDay(){
        return day;
    }

    public String getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
}
