package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("a.txt");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
