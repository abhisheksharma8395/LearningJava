package streams_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(System.out::println);

        // 3. reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> (x + y));
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch , allMatch , noneMatch
        boolean b = list.stream().anyMatch((x) -> x % 2 == 0);
        boolean c = list.stream().allMatch((x) -> x > 0);
        boolean d = list.stream().noneMatch((x) -> x < 0);
        System.out.println("Any Match : " + b);
        System.out.println("All Match : "+c);
        System.out.println("none Match : "+d);


        // 6. findFirst , findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7. toArray()
        Object[] array = Stream.of(1,2,3,4,5,6,7,8).toArray();

        // 8. min/max
        System.out.println("Max : "+Stream.of(2, 44, 69).max((m, n) -> m-n).get());
        System.out.println("Min : "+Stream.of(2, 44, 69).min(Comparator.naturalOrder()).get());

        // 9. forEachOrdered -> Used for parallel Stream
        List<Integer> numbers0 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using for Each with parallel stream");
        numbers0.parallelStream().forEach(x -> System.out.print(x+" , "));
        System.out.println(" ");

        System.out.println("Using For Each Ordered with parallel stream");
        numbers0.parallelStream().forEachOrdered(x -> System.out.print(x+" , "));
        System.out.println(" ");


        // Example -> Extract the name from list whose length is greater than 3
        List<String> names = Arrays.asList("Anna", "Bob" , "Charlie","David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example -> Squaring and sorting numbers
        List<Integer> numbers = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

        // Example -> Summing Values
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println(integers.stream().reduce((x,y) -> x+y).get());

        // Example -> Counting Occurrence of character
        String sentence = "Hello World";
        // By using .chars() method your String converts into IntStream of Unicode code prints
        System.out.println(sentence.toLowerCase().chars().filter( x -> x=='l').count());

        // Stateful and Stateless operation
        // Stateful -> have information about all element (e.g. -> sorted , distinct)
        // Stateless -> only focus on current element (e.g -> Map , filter etc.)

    }
}
