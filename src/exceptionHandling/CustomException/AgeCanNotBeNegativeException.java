package exceptionHandling.CustomException;

public class AgeCanNotBeNegativeException extends Exception {
    public AgeCanNotBeNegativeException() {
        super("Age can not be negative");
    }
}
