package BankAccountBalance;

public class BankAccount {

    private double balance;
    public BankAccount(){
        balance = 0.0;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdraw (double amount) throws InsufficientFundException {
        if (amount > balance){
            throw new InsufficientFundException("Insufficient funds. Available balance: " + balance);
        } else {
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

}
