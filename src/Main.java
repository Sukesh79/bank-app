public class Main {
    public static void main(String[] args) {

        System.out.println("let's create a bank app");
        Bank sbiBankAccount = new SBIBankAccount(1000, "Akanksha", "Akanksha12345");
        sbiBankAccount.addMoney(100);
        sbiBankAccount.withdrawMoney(100);
        int balance = sbiBankAccount.checkBalance();
        System.out.println(balance);
    }
}