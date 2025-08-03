public class StaticMethodOverrides {
    public static void main(String[] args) {
        B.m1();
    }
}
class A{
    static void m1(){
        System.out.println("Welcomes to class A");
    }
}
class B extends A{

    static void m1(){
        System.out.println("Welcomes to class B");
    }
}