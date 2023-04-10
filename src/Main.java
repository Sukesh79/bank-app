import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the money you want to withdraw = ");
        int withdraw = sc.nextInt();

        System.out.println("let's create a bank app");
        Bank sbiBankAccount = new SBIBankAccount(1000, "Akanksha", "Akanksha12345");
        sbiBankAccount.addMoney(100);

        int balance = sbiBankAccount.checkBalance();
        if(balance > withdraw) sbiBankAccount.withdrawMoney(withdraw);
        else System.out .println("you don't have sufficient funds");
        System.out.println(balance);
    }
}