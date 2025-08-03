package Abstraction.ex1;

public class Test {
    public static void main(String[] args) {
        Shape c = new Circle("Red",5.0);
        Shape r = new Rectangle("Yellow",5.0,6.0);
        System.out.println(c);
        System.out.println(r);
    }

}
