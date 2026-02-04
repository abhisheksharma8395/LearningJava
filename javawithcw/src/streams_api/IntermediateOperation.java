package streams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
        // Intermediate operation transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Ram");
        // No filtering at this point
        Stream<String> filteredStream = list.stream().filter((x) -> x.startsWith("A"));
        // Until you not applied any terminal operation the filtering does not work
        long res = list.stream().filter((string) -> string.startsWith("A")).count();
        System.out.println(res);

        // 2. map
        Stream<String> stream1 = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> stream2 = list.stream().sorted();
        Stream<String> stream3 = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. Distinct
        long count = list.stream().filter((x) -> x.startsWith("R")).distinct().count();
        System.out.println(count);

        // 5. limit
        Stream<Integer> stream4 = Stream.iterate(0,(x) -> x+1).limit(100) ;

        // 6. skip
        Stream.iterate(0,(x) -> x+1).skip(10).limit(100).forEach(System.out::println); ;

        // 7. peek
        // Performs an action on each element as it is consumed
        Stream.iterate(1,x -> x+1).skip(10).limit(100).peek(x -> System.out.println(x)).count();

        // 8. flatMap
        // Handle streams of collection, lists, or arrays where each element is itself a collection
        // Flatten nested structure (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Apple","Banana") , Arrays.asList("Orange","Kiwi") , Arrays.asList("Pear", "Grape"));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(x -> x.toUpperCase()).collect(Collectors.toList()));

        // Example 2 of flatMap ->
        List<String> sentences = Arrays.asList("Hello World", "Java Streams are powerful","flatMap is useful");
        List<String> sentenceList = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(s -> s.toUpperCase()).toList();
        System.out.println(sentenceList);

        // Example
        // Streams cannot be reused after a terminal operation has been called
        List<String> names = Arrays.asList("Abhishek","Virat Kohli","Lionel Messi","Christiano Ronaldo","Marnus Labuschagne");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        List<String> list1 = stream.map(String::toUpperCase).toList();           // Exception because we are reusing the stream after having terminal operation

    }
}
