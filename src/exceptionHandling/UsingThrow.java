package exceptionHandling;

public class UsingThrow {
    public static void main(String[] args) {
        voteValid(16);
    }
    public static void voteValid(int age){
        if(age<0){
            throw new ArithmeticException("Age can't be negative🚨");
        }
        if ((age > 0) && (age < 18)){
            throw new ArithmeticException("Not valid age for casting vote 😠");
        }
        else{
            System.out.println("You are able for casting vote");
        }
    }
}
