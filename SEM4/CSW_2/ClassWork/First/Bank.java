package ClassWork.First;

public class Bank {
    private String name;
    private long accountNumber;
    private double balance;
    private String accountType;

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        if(accountType.equals("Savings") || accountType.equals("Current")){
            this.accountType = accountType;
        }else {
            System.out.println("Invalid");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance < 0){
            System.out.println("Invalid balance");
        }else {
            this.balance = balance;
        }
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount to withdraw");
        }else{
            balance += amount;
            System.out.println(amount + " deposited");
            System.out.println("Balance = " + this.balance);
        }
    }
    public void withdrawal(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount to withdraw");
        }
        else if (amount > this.balance){
            System.out.println("Amount exceeds account balance");
        }else {
            balance -= amount;
            System.out.println(amount + " withdrawn");
            System.out.println("Balance = " + this.balance);
        }
    }
    public double interestCalculate(){
        if(this.accountType.equals("Savings")){
            return .06*this.balance;
        }else if(this.accountType.equals("Current")){
            return .01*this.balance;
        }else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Bank b = new Bank();
        b.setName("Ankush");
        b.setAccountNumber(67481250005561L);
        b.setBalance(1256.34);
        b.setAccountType("Current");
        System.out.println(b.getName());
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
        System.out.println(b.getAccountType());
        b.deposit(500);
        b.withdrawal(200);
        System.out.println(b.interestCalculate());
    }
}
