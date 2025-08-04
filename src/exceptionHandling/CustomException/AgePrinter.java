package exceptionHandling.CustomException;

public class AgePrinter {
    public static void main(String[] args) throws AgeCanNotBeNegativeException {
        int age = -5;
        if (age < 0) {
            throw new AgeCanNotBeNegativeException();
        }
    }
}
