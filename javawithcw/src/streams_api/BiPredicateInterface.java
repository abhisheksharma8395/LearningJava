package streams_api;
import regex.PhoneNumberValidation;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class BiPredicateInterface {
    public static void main(String[] args) {

        // BiPredicate
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));

        // BiFunction
        BiFunction<String,String,Integer> stringLength = (x,y) -> (x.length()+y.length());
        System.out.println(stringLength.apply("Abhishek","Sharma"));

        // UnaryOperator and BinaryOperator extends Function and BiFunction interface respectively
        // Instead of writing Function<Integer,Integer> function = (x) -> 2*x;
        // we can write
        UnaryOperator<Integer> unaryOperator = (x) -> 2*x;
        System.out.println(unaryOperator.apply(6));

        // Instead of writing BiFunction<Integer,Integer,Integer> bifunction = (x,y) -> x+y;
        // we can write
        BinaryOperator<Integer> binaryOperator = (x,y) -> (x+y);
        System.out.println(binaryOperator.apply(5,7));

        // BiConsumer
        BiConsumer<String,Double> biConsumer = (s,d) -> System.out.println(s+d);
        biConsumer.accept("Abhishek",9.5);


        // Method reference --> use method without invoking & in place of lambda expression
        List<String> student = Arrays.asList("Ram","Shyam","Ghanshyam");
        student.forEach((string) -> System.out.println(string));
        System.out.println("==========================================");

        // Method reference --> use method without invoking & in place of lambda expression
        // You replace a lambda expression with a method reference when the lambda body does
        // nothing more than call a single existing method, and the method’s signature matches the
        // functional interface exactly.
        // so instead of writing (string) -> System.out.println(string) inside foreach
        // we can write
        student.forEach(System.out::println);


        // Constructor reference
        List<String> names = Arrays.asList("A","B","C");

        // here inside map we use method reference instead of using lambda expression (x) -> new MobilePhone(x)
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        mobilePhoneList.forEach((MobilePhone mobile) -> System.out.println(mobile.phoneIMEI));
    }


}
class MobilePhone{
    String phoneIMEI;

    public MobilePhone(String phoneIMEI) {
        this.phoneIMEI = phoneIMEI;
    }
}
