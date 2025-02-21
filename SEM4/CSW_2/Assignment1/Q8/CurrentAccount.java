package Assignment1.Q8;

public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);
        System.out.println("Deposited Amount = " + amount);
        System.out.println("Balance = " + this.getBalance());
    }

    public void withdraw(double amount){
        if(amount > this.getBalance() + overdraftLimit){
            System.out.println("Insufficient balance");
        }else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount " + amount + " withdrawn");
            System.out.println("Balance = " + this.getBalance());
        }
    }
}
