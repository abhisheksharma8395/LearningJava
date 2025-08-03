package Generics;

public class GenericMethods {
    public <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        GenericMethods gm = new  GenericMethods();
        gm.printArray(new String[]{"Parashar", "Sharma", "Kumar"});
        gm.printArray(new Integer[]{1,2,3,4,5,6,7,8,9,10});
    }
}
