public class Q1c extends Bank{
    Q1c(){
        super("SBI");
        // super("Axis");   --> Only one superclass constructor call allowed
    }
    public static void main(String[] args) {
        Bank bank = new Q1c();
        System.out.println(bank.getBankName());
    }
}
abstract class Bank{
    private String bankName;
    Bank(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName(){
        return "Your Bank Name is:" + bankName;
    }
}
