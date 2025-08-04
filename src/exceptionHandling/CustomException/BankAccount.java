package exceptionHandling.CustomException;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientFundException{
        if(amount > this.balance){
            throw new InsufficientFundException();
        }
        this.balance -= amount;
    }
}
