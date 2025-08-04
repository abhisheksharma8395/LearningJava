package exceptionHandling.CustomException;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(6000.0);
        try{
            account1.withdraw(8000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
