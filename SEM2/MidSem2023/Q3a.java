public class Q3a {}

interface StaffInterface{
    void displayStaff();
    void giveBonus(double amount);
}
abstract class Staff {
    String Fname;
    String Lname;
    int salary;
    public Staff(String fname, String lname, int salary) {
        Fname = fname;
        Lname = lname;
        this.salary = salary;
    }
}

