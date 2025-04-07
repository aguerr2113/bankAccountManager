public class BankAccountManager {
    private double balance;

    public BankAccountManager(){
        balance = 0.0;
    }

    public void deposit(double amount){
        if(amount > 0.00){
            balance += amount;
            System.out.println("Deposit Successful.");
            System.out.println("Account: " + balance);
        }
        else{
            System.out.println("Deposit must be greater than $0.00");
        }
    }
    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Enter a valid amount please...");
        }
        else if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl Successful.");
            System.out.println("Account: " + balance);
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance(){
        return balance;
    }
}
