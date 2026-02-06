package streams_api.example_question.map;

import streams_api.example_question.sets.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapQuestion {
    public static void main(String[] args) {
        // Example - 1 ->  Given a Map of student names and scores, find the student with the highest score.
        System.out.println("Example - 1");
        Map<String, Double> map1 = new HashMap<>();
        map1.put("Abhishek Sharma", 67.0);
        map1.put("Virat Kohli", 95.0);
        map1.put("Rohit Sharma", 89.0);
        map1.put("Mahendra Singh Dhoni", 88.0);
        map1.put("Jasprit Bumrah", 83.0);
        String name = map1.keySet().stream().max((x, y) -> (int) (map1.get(x) - map1.get(y))).stream().collect(Collectors.joining());
        System.out.println(name);


        // Example - 2 -> Convert a Map to a sorted list of students by score.
        System.out.println("Example - 2");
        List<String> sortedList = map1.keySet().stream().sorted((x, y) -> (int) (map1.get(y) - map1.get(x))).collect(Collectors.toList());
        System.out.println(sortedList);

        // Example - 3 ->  Find the first non-repeating character in a given string using Map.
        System.out.println("Example - 3");
        String string = "hello hi how are you i am fine";
        Map<Character, Integer> map2 = string.chars().mapToObj(x -> (char) x).collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(string.chars().mapToObj(x -> (char) x).filter(x -> map2.get(x) == 1).findFirst().get());
//
//        // Example - 4 -> You have a Set of unique numbers. Convert it to a sorted list.
//        System.out.println("Example - 4");
//        List<String> names = Arrays.asList("Abhishek Sharma","Virat","Dhoni","Virat","Rohit","Suresh","Ramesh","Ram","Shyam","GhanShyam","Ram");
//        Set<String> set3 = names.stream().collect(Collectors.toSet());
//        System.out.println(set3);
//
        // Example 5 ->   Convert a Map into a list of "ID: Name" formatted strings.
        System.out.println("Example - 5");
        Map<Integer,String> map3 = new HashMap<>();
        map3.put(1,"Abhishek Sharma");
        map3.put(2,"Virat Kohli");
        map3.put(3,"Rohit Sharma");
        map3.put(4,"Mahendra Singh Dhoni");
        map3.put(5,"Jasprit Bumrah");
        List<String> studentList = map3.keySet().stream().map(x -> x+" : "+map3.get(x)).collect(Collectors.toList());
        System.out.println(studentList);


        // Example 6 ->  . Merge two Map by adding values for common keys.
        System.out.println("Example - 6");
        Map<String, Integer> odiCenturies = new HashMap<>();
        odiCenturies.put("Virat Kohli", 54);
        odiCenturies.put("Rohit Sharma", 33);
        odiCenturies.put("Mahendra Singh Dhoni", 15);
        odiCenturies.put("Suresh Raina", 5);

        Map<String,Integer> testCenturies = new HashMap<>();
        testCenturies.put("Virat Kohli", 30);
        testCenturies.put("Mahendra Singh Dhoni", 6);
        testCenturies.put("Sachin Tendulkar", 51);
        testCenturies.put("Jaques Kallis", 45);
        testCenturies.put("Rickey Ponting",41);

        Map<String,Integer> totalCenturies = new HashMap<>();
        odiCenturies.forEach((key,value) -> {
            if(testCenturies.containsKey(key)){
                totalCenturies.put(key, value + testCenturies.get(key));
            }
            else{
                totalCenturies.put(key,value);
            }
        });
        testCenturies.forEach((key,value) -> {
            if(!totalCenturies.containsKey(key)){
                totalCenturies.put(key, value);
            }
        });
        System.out.println(totalCenturies);


        // Example 7 -> Merge two Map by adding values for common keys.
        System.out.println("Example - 7");
        Map<String, Integer> itemsPrice = new HashMap<>();
        itemsPrice.put("Shampoo", 200);
        itemsPrice.put("Cricket Bat", 1500);
        itemsPrice.put("Guitar", 8900);
        itemsPrice.put("Laptop", 50000);
        System.out.println(itemsPrice);
        itemsPrice.forEach((key,value) -> itemsPrice.put(key,value+(int)(value*0.05)));
        System.out.println(itemsPrice);


        // Example 8 ->  Filter a Map to retain only entries where value > 50.
        System.out.println("Example - 8");
        Map<String , Integer> map4 = new HashMap<>();
        map4.put("Abhishek Sharma",20);
        map4.put("Virat Kohli",96);
        map4.put("Rohit Sharma",85);
        map4.put("Mahendra Singh Dhoni",88);
        map4.put("Jasprit Bumrah",59);
        map4.put("Lionel Messi",39);
        map4.put("Christiano Ronaldo",23);
        map4.put("Joe Root",43);
        map4.put("Steve Smith",54);
        System.out.println(map4);
        map4 = map4.entrySet().stream().filter(x -> x.getValue() > 50).collect(Collectors.toMap(k -> k.getKey(),v -> v.getValue()));
        System.out.println(map4);


        // Example 9 ->  Given a map of employees (Map), find the employee with the highest experience.
        System.out.println("Example - 9");
        Map<String , Integer> employeeMap = new HashMap<>();
        employeeMap.put("Abhishek Sharma",2);
        employeeMap.put("Virat Kohli",18);
        employeeMap.put("Rohit Sharma",19);
        employeeMap.put("Mahendra Singh Dhoni",21);
        employeeMap.put("Jasprit Bumrah",10);
        employeeMap.put("Lionel Messi",17);
        employeeMap.put("Christiano Ronaldo",13);
        employeeMap.put("Joe Root",16);
        employeeMap.put("Steve Smith",14);
        System.out.println(employeeMap.keySet().stream().max(Comparator.comparing(x-> employeeMap.get(x))).get());


        // Example 10 -> Check if two maps have at least one common key.
        System.out.println("Example - 10");
        Map<String,Integer> neighbourCountries = new HashMap<>();
        neighbourCountries.put("China",1);
        neighbourCountries.put("Sri Lanka",2);
        neighbourCountries.put("Nepal",3);
        neighbourCountries.put("Bhutan",4);
        neighbourCountries.put("Afganistan",5);
        neighbourCountries.put("Myanmar",6);

        Map<String,Integer> countriesName = new HashMap<>();
        countriesName.put("India",1);
        countriesName.put("United States Of America",2);
        countriesName.put("Russia",3);
        countriesName.put("China",4);
        countriesName.put("France",5);
        countriesName.put("Japan",6);
        System.out.println(countriesName.keySet().stream().anyMatch(x -> neighbourCountries.containsKey(x)));
    }
}
