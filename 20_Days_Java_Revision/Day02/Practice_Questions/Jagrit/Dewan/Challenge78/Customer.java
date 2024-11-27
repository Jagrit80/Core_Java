package Jagrit.Dewan.Challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount("2614201736","Jagrit Dewan");
        bankacc.depositMonet(500);
        System.out.println(bankacc.withdrawMoney(1000));
        bankacc.depositMonet(-40);
        bankacc.withdrawMoney(0);


    }
}
