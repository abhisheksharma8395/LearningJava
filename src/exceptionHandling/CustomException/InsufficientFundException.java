package exceptionHandling.CustomException;

public class InsufficientFundException extends Exception{
    InsufficientFundException(){
        super("You do not have that much of money available in your account");
    }
}
