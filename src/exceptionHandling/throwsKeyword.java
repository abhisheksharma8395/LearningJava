package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class throwsKeyword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        try{
            a = 5;
            b = 0;
        }catch(Exception e){
            System.out.println("Input Mismatch Error");
            return;
        }
        System.out.println(a+"/"+b+" = "+(a/b));
    }
}
