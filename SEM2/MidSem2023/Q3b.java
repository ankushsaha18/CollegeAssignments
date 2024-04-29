import java.util.Scanner;

public class Q3b {
    public static void main(String[] args) {
        StaffInterface[] arr = new Supervisor[2];
        try {
            arr[0] = new Supervisor("Ankush","Saha",50000,5);
            arr[1] = new Supervisor("Kunal","kush",100000,10);
            for(StaffInterface i : arr){
                i.displayStaff();
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Bonus Amount:");
            arr[0].giveBonus(sc.nextInt());
            arr[0].displayStaff();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
class Supervisor extends Staff implements StaffInterface{
    double bonus;
    Supervisor(String Fname,String Lname,int salary,double bonus){
        super(Fname,Lname,salary);
        if(bonus <= 0){
            throw new IllegalArgumentException("Bonus should be greater than zero");
        }
        this.bonus = bonus;
    }
    public void displayStaff() {
        System.out.println("SuperVisor: "+Fname+" "+Lname+" Salary = Rs."+salary+" Bonus = Rs."+bonus);
    }
    public void giveBonus(double amount) {
        if(amount <= 0){
            throw new IllegalArgumentException("Bonus must be greater than zero");
        }
        bonus += amount;
    }
}
