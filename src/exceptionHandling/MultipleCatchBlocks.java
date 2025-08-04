package exceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] numerator = {100,220,300,420,500,620,700,800};
        int[] denominator = {10,20,30,40,50,60,70,0};
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println(numerator[i] + " / " + denominator[i]+" = "+numerator[i]/denominator[i]);
            } catch(ArithmeticException e){
                System.out.println("Arithmetic Exception Occured");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out Of Bounds");
            }

        }
    }
}
