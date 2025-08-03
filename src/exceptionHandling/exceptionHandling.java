package exceptionHandling;

public class exceptionHandling {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
