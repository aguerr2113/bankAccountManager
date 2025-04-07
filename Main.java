public class Main {
    public static void main(String[] args) {
        BankAccountManager myAccount = new BankAccountManager();
        myAccount.deposit(100.0);
        myAccount.withdraw(40.0);
        System.out.println("Current balance: $" + myAccount.getBalance());
    }
}
