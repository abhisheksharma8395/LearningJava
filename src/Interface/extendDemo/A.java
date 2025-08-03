package Interface.extendDemo;

public interface A {
    default void greet() {
        System.out.println("Hello, How are you?");
    }
}
