package streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo  {
    public static void main(String[] args) {
        // features introduced in java 8
        // process collections of data in a functional and declarative manner
        // Simplify data processing
        // Embrace functional programming
        // Improving Readability and Maintainability
        // Enable easy Parallelism

        // What is Stream ?
        // A sequence of elements supporting various operations

        // How to use Streams ?
        // Source, Intermediate Operation & terminal operations

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        // By using classical approach
        int count = 0;
        for(int number : numbers){
            if(number % 2 == 0) count++;
        }
        System.out.println("Even Numbers is "+count);

        // By using Stream Api
        System.out.println(numbers.stream().filter((number) -> (number % 2) == 0).count());

        // Creating Streams

        // 1. From Collections
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream1 = list1.stream();

        // 2. From Arrays
        String[] array = {"Abhishek","Virat","Dhoni","Rohit"};
        Stream<String> stream2 = Arrays.stream(array);

        // 3. Using Stream.of()
        Stream<String> stream3 = Stream.of("a","b");

        // 4. Infinite Streams -> By using generate(Supplier) and iterate(Unary Operator)
        Stream<Integer> stream4 = Stream.generate(() -> 1);
        // Infinite stream to finite stream
        Stream<Integer> stream5 = Stream.generate(() -> 3).limit(100);


        List<Integer> list2 = Stream.iterate(0,(x) -> x+1).limit(100).collect(Collectors.toList());
        list2.forEach(System.out::println);

    }
}
