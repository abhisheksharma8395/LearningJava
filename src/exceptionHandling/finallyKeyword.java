package exceptionHandling;

public class finallyKeyword {
    public static void main(String[] args) {
        System.out.println(divide(1,0));
    }

    public static int divide(int a,int b){
        try{
            System.out.println("Inside try block");
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Division by zero Exception Occured");
            return -1;
        }finally{
            System.out.println("Inside finally block");
        }
    }
}
