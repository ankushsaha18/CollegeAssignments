package Assignment1.Q8;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount){
        double interest = (this.getBalance() + amount) * this.interestRate / 100;
        this.setBalance(this.getBalance() + amount + interest);
        System.out.println("Deposited Amount = " + amount);
        System.out.println("Balance = " + this.getBalance());
    }

    public void withdraw(double amount){
        if(amount > this.getBalance()){
            System.out.println("Insufficient balance");
        }else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount " + amount + " withdrawn");
            System.out.println("Balance = " + this.getBalance());
        }
    }
}
