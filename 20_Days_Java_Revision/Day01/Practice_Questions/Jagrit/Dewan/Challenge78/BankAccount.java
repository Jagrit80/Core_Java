package Jagrit.Dewan.Challenge78;

public class BankAccount {
    private String AccountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        AccountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMonet (double money){
       if(money<=0){
           System.out.println("Invalid Deposit");
       }else
       { balance = balance + money;}
    }

    public double withdrawMoney(double money){
        if(balance>=money)
        {balance = balance-money;}
        else{
            System.out.println("Insufficient Balance");
        }
        return money;
    }
}
