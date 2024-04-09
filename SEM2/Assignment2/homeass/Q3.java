package homeass;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Bank[] per1 = new Bank[5];
        for(int i = 0 ; i < 5 ; i++){
            per1[i] = new Bank();
            per1[i].setBankName();
            per1[i].setDepositAmount();
        }
        System.out.println("BankName\tDeposit Amount");
        for(Bank b : per1){
            b.showData();
        }
        System.out.println("Total Amount Deposited = " + Bank.totalAmount);
        System.out.println("BankName where minimum amount deposited :" + (Bank.minDepAmt(per1)).bankName);
    }
}
class Bank{
    String bankName;
    double depositAmount;
    static double totalAmount;
    void setBankName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bank name:");
        this.bankName = sc.nextLine();
    }
    void setDepositAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Deposit Amount:");
        this.depositAmount = sc.nextDouble();
        while(depositAmount < 1000){
            System.out.println("Minimum Deposit amount must be 1000");
            System.out.print("Enter Deposit Amount:");
            this.depositAmount = sc.nextDouble();
        }
        totalAmount += depositAmount;
    }
    void showData(){
        System.out.println(bankName+"\t"+depositAmount);
    }
    static Bank minDepAmt(Bank[] arr){
        Bank min = arr[0];
        for(Bank i : arr){
            if(i.depositAmount < min.depositAmount){
                min = i;
            }
        }
        return min;
    }
}
