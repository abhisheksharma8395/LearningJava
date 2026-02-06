package streams_api.example_question.sets;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetsQuestion {
    public static void main(String[] args) {

        // Example - 1 -> Given two sets of users (Set), find the common users (intersection).
        System.out.println("Example - 1");
        Set<Integer> set1 = new HashSet<>(Arrays.asList(8,9,2,4,5,3,7,6,1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,7,8,9,10,11,12,13));
        Set<Integer> intersectionSet = set1.stream().filter(x -> set2.contains(x)).collect(Collectors.toSet());
        System.out.println(intersectionSet);


        // Example - 2 -> You have a Set of unique numbers. Convert it to a sorted list.
        System.out.println("Example - 2");
        List<Integer> sortedList = set1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // Example - 3 -> Given two Set, find all numbers that exist in either but not both (symmetric difference).
        System.out.println("Example - 3");
        System.out.println(Stream.concat(set1.stream(), set2.stream()).filter(x -> !(set1.contains(x) && set2.contains(x))).collect(Collectors.toSet()));

        // Example - 4 -> You have a Set of unique numbers. Convert it to a sorted list.
        System.out.println("Example - 4");
        List<String> names = Arrays.asList("Abhishek Sharma","Virat","Dhoni","Virat","Rohit","Suresh","Ramesh","Ram","Shyam","GhanShyam","Ram");
        Set<String> set3 = names.stream().collect(Collectors.toSet());
        System.out.println(set3);

        // Example 5 ->  You have a set of country names. Find the first country that starts with "I".
        System.out.println("Example - 5");
        Set<String> countryName = new HashSet<>(Arrays.asList("Argentina","United Kingdom","India","Italy","Germany","France","Russia","Israel","Canada","United States of America","Indonesia"));
        countryName.stream().filter(x -> x.charAt(0) == 'I').findFirst().ifPresent(x -> System.out.println(x));

        // Example 6 ->  Given a set of product IDs, check if a specific ID exists.
        System.out.println("Example - 6");
        Set<String> productId = new HashSet<>(Arrays.asList("PID1010","PID1011","PID1012","PID2324","PID2820","PID1823","PID1324","PID1547","PID3457","PID6521","PID1014"));
        System.out.println(productId.stream().anyMatch(x -> x.equals("PID2820")));

        // Example 7 -> Convert a HashSet to a TreeSet for sorted order.
        System.out.println("Example - 7");
        Set<Integer> set4 = new HashSet<>(Arrays.asList(32,23,4,9,76,50,85,50,18,12,48));
        TreeSet<Integer> treeSet = set4.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(treeSet);

        // Example 8 -> Finding the largest and Smallest element in the set
        System.out.println("Example - 8");
        int max = set4.stream().max(Comparator.naturalOrder()).get();
        int min = set4.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Maximum : "+max+", Minimum : "+min);

        // Example 9 -> Given a Set, find the employee with the highest salary.
        System.out.println("Example - 9");
        List<Employee> salaries = Arrays.asList(new Employee("Abhishek Sharma",55000.0),new Employee("Virat Kohli",150000.0),
                new Employee("Mahendra Singh Dhoni",120000.0),new Employee("Rohit Sharma",80000.0));
        Set<Employee> set = new HashSet<>(salaries);
        System.out.println(set.stream().max(Comparator.comparing(x -> x.salary)).get().employeeName);

        // Example 10 -> Merge two sets while removing duplicate elements.
        System.out.println("Example - 10");
        Set<String> northStates = new HashSet<>(Arrays.asList("Uttar Pradesh","Madhya Pradesh","Rajasthan","Haryana","Punjab","Maharastra"));
        Set<String> southStates = new HashSet<>(Arrays.asList("Tamil Nadu","Karnataka","Kerala","Andhra Pradesh","Maharastra"));
        Set<String> indianStates = Stream.concat(northStates.stream(),southStates.stream()).collect(Collectors.toSet());
        System.out.println(indianStates);
     }
}
