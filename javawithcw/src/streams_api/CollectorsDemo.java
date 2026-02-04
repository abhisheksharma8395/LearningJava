package streams_api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collector is a utility class
        // Provides a set of methods to create common collectors

        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> set = nums.stream().distinct().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a specified collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(collect);

        // 4. Joining Strings
        // Concatenate stream elements into a single String
        String concatenatedNames = names.stream().map(String ::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5. Summarizing Data
        // Generates statistical summary (count , sum , min , average , max )
        List<Integer> numbers = Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count : "+stats.getCount());
        System.out.println("Sum : "+stats.getSum());
        System.out.println("Max : "+stats.getMax());
        System.out.println("Min : "+stats.getMin());
        System.out.println("Average : "+stats.getAverage());
        
        // 6. Calculating Average
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average : "+average);

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count : "+count);

        // 8. Grouping Element
        List<String> words = Arrays.asList("Hello","World","Java","Streams","Collecting","Abhishek","Virat","Messi","Ronaldo");
        System.out.println(words.stream().collect(Collectors.groupingBy((x -> x.length()))));
        System.out.println(words.stream().collect(Collectors.groupingBy(((String x) -> x.length()),Collectors.joining(" , "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(((String x) -> x.length()),Collectors.counting())));

        TreeMap<Integer,List<String>> treeMap = words.stream().collect(Collectors.groupingBy((String x) -> x.length(),TreeMap :: new,Collectors.mapping(x -> x,Collectors.toList())));
        System.out.println(treeMap);

        // 9. Partitioning Element
        // Partition elements into two groups (true and false) based on predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        // Assignment -----------------------------
        // Example 1 -> Collecting Names By length
        List<String> l1 = Arrays.asList("Anna","Bob","Alexander","Brian","Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()))));

        // Example 2 -> Counting word Occurrence
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3 -> Partitioning Even And Odd Number
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // Example 4 -> Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));
        System.out.println(items.values().stream().reduce((x, y) -> x + y).get());

        // Example 5 -> Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
        Map<Integer,String> map = fruits.stream().collect(Collectors.groupingBy(x->x.length(),Collectors.joining(",")));
        System.out.println(map);
        // Another Efficient way of creating Map
        Map<String,Integer> map1 = fruits.stream().collect(Collectors.toMap(x -> x,x-> x.length()));
        System.out.println(map1);

        // Example 6 ->
        List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
        Map<String,Integer> map2 = words2.stream().collect(Collectors.toMap( k-> k,v->1,(x,y) -> x+y));
        System.out.println(map2);

    }
}
