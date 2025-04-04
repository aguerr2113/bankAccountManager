public class BankAccountManager {
    private double balance;

    public BankAccountManager(){
        balance = 0.0;
    }

    public void deposit(double amount){
        if(amount > 0.00){
            balance += amount;
        }
        else{
            System.out.println("Deposit must be greater than $0.00");
        }
    }
    public void withdraw(double amount){
        if(amount > 0){
            if (amount > balance) {
                System.out.println("Insufficient Funds...");
            }
        }
        else{
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
