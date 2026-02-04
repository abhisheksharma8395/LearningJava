package streams_api;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateInterface {
    public static void main(String[] args) {
        // Predicate -> functional interface
        // it has only one abstract method test return type is boolean
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println(isEven.test(6));


        Predicate<String> isWordStartsWithA = x -> x.toUpperCase().charAt(0) == 'A';
        Predicate<String> isWordEndsWithA = x -> x.toUpperCase().charAt(x.length() - 1) == 'A';
        Predicate<String> and = isWordStartsWithA.and(isWordEndsWithA);
        System.out.println(and.test("Amana"));
        System.out.println(and.test("pumpkin"));


        // Function -> Functional Interface
        // it has only one abstract method apply takes two datatype one for the parameter and other is return type
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;

        System.out.println(doubleIt.apply(4));
        System.out.println(tripleIt.apply(9));


        // Consumer -> Functional Interface
        // it has only one abstract method accept it has void return type
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(7);

        // Supplier -> Functional Interface
        // it has only one abstract method get it takes no parameter but returns specific type
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());


        // Combined Example
        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer> supplier1 = () -> 100;
        if(predicate.test(supplier1.get())){
            consumer1.accept(function.apply(supplier1.get()));
        }
    }
}

