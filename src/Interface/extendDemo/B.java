package Interface.extendDemo;

public interface B extends A {
    void meet();

    int a = 1000;

}
// interfaces can have methods from JDK 1.8 onwards
interface TestInterface
{
    final int a = 10;

    private void message(){                       //private method in Interface
        System.out.println("You are getting greeting from an Indian heart");
    }

    default void greet() {
        message();                               //default method in Interface
        System.out.println("Namaste");
    }

    static void print_Bharat(){                 //static method in Interface
        System.out.println("Bharat");
    }
}

// A class that implements the interface.
class TestClass implements TestInterface
{
    // Driver Code
    public static void main (String[] args) {
        TestInterface t = new TestClass();
        t.greet();
        TestInterface.print_Bharat();
    }
}