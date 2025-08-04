package exceptionHandling;

import exceptionHandling.CustomException.AgeCanNotBeNegativeException;

public class IllegalArgumentException {
    public static void main(String[] args) throws AgeCanNotBeNegativeException {
        int area = -200;
        if(area<0){
            throw new java.lang.IllegalArgumentException("Area can not be negative");
        }
        System.out.println(area);
    }
}
