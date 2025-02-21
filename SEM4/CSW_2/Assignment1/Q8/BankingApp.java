package Assignment1.Q8;

public class BankingApp {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(6241589,1000,3.5);
        CurrentAccount c = new CurrentAccount(7842156,12895,10000);
        s.deposit(500);
        s.withdraw(3000);
        c.withdraw(15000);
    }
}
