package exceptionHandling;

public class IndexOutOfBoundException {
    public static int devide(int a,int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Devide by zero Exception occured");
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i = 0;i<10;i++) {
            try {
                System.out.println(devide(numerator[i], denominator[i]));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of Bound Exception");
            }
        }
        System.out.println("Good Job 🤨");
    }
}

