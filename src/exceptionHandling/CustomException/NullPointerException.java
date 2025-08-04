package exceptionHandling.CustomException;

public class NullPointerException{
    public static void main(String[] args){
        String s = null;
        try{
            System.out.println(s.length());
        }catch(java.lang.NullPointerException e){
            System.out.println("Null Pointer Exception Occured");
        }finally {
            System.out.println("Program Terminated after the operation");
        }
    }
}
