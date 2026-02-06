package streams_api.example_question.collection_framework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class ExampleQuestion {
    public static void main(String[] args) {
        // Example - 1 -> You have a list of student scores. Find the top 3 highest scores using Java 8.
        List<Integer> marks = Arrays.asList(89,79,34,67,75,98,34,65,91,82);
        System.out.println("Example - 1");
        System.out.println(marks.stream().sorted(Comparator.reverseOrder()).limit(3).toList());

        // Example - 2 ->  Given a list of employee salaries, increase each salary by 10% and store the result in a new list
        List<Double> salaries = Arrays.asList(45000.0,40000.0,55000.0,43500.0,60000.0,40000.0,75000.0,50000.0,45000.0,15000.0);
        List<Double> updatedSalaries = salaries.stream().map(x -> x+(0.1)*x).collect(Collectors.toList());
        System.out.println("Example - 2");
        System.out.println(updatedSalaries);

        // Example - 3 ->   You have a list of product names. Remove all names that contain the word "outdated".
        System.out.println("Example - 3");
        List<String> productName = Arrays.asList("Shampoo Outdated","Conditioner","Hair Oil Outdated","Minoxidil","Moisturizer","Rice Water Outdated");
        System.out.println(productName);
        productName = productName.stream().filter(x -> !x.toLowerCase().contains("outdated")).collect(Collectors.toList());
        System.out.println(productName);

        // Example - 4 -> A list contains duplicate integers. Remove duplicates while maintaining insertion order.
        System.out.println("Example - 4");
        List<Integer> integerList = Arrays.asList(23,18,23,42,90,89,90,89);
        System.out.println(integerList);
        integerList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(integerList);

        // Example - 5 -> . Given a list of customer orders, find the total revenue generated.
        System.out.println("Example - 5");
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Abhishek Sharma",1250.0));
        orders.add(new Order("Virat Kohli",7500.0));
        orders.add(new Order("Rohit Sharma",5000.0));
        orders.add(new Order("Mahendra Singh Dhoni",5570.0));
        orders.add(new Order("Suresh Raina",9530.0));
        orders.add(new Order("Yuvraj Singh",2468.0));
        double revenue = orders.stream().collect(Collectors.summingDouble(x->x.fees));
        System.out.println(revenue);

        // Example - 6 ->  Convert a list of full names ("John Doe") into a list of only first names.
        System.out.println("Example - 6");
        List<String> fullNames = Arrays.asList("Abhishek Sharma","Mahendra Singh Dhoni","Virat Kohli","Rohit Sharma","Ishan Kishan");
        System.out.println(fullNames);
        List<String> firstName = fullNames.stream()
                .map(x -> x.split(" ")[0])
                .collect(Collectors.toList());
        System.out.println(firstName);

        // Example - 7 -> Given a list of dates, find out which dates fall on a weekend.
        System.out.println("Example - 7");
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2026, 2, 1));
        dates.add(LocalDate.of(2026, 2, 2));
        dates.add(LocalDate.of(2026, 2, 3));
        dates.add(LocalDate.of(2026, 2, 4));
        dates.add(LocalDate.of(2026, 2, 5));
        dates.add(LocalDate.of(2026, 2, 6));
        dates.add(LocalDate.of(2026, 2, 7));
        List<LocalDate> weekendDays = dates.stream().filter(date -> date.getDayOfWeek() == SATURDAY || date.getDayOfWeek() == SUNDAY).collect(Collectors.toList());
        System.out.println(weekendDays);

        // Example - 8 -> You have a list of transactions with timestamps. Find the most recent transaction.
        System.out.println("Example - 8");
        List<LocalDateTime> transactions = new ArrayList<>();
        transactions.add(LocalDateTime.of(2026, 2, 1, 12, 30, 7));
        transactions.add(LocalDateTime.of(2026, 2, 2, 9, 15, 0));
        transactions.add(LocalDateTime.of(2026, 2, 3, 14, 45, 30));
        transactions.add(LocalDateTime.of(2026, 2, 4, 18, 30, 18));
        transactions.add(LocalDateTime.of(2026, 2, 3, 21, 10, 5));
        LocalDateTime recentTransactionTime = transactions.stream().max(Comparator.naturalOrder()).get();
        System.out.println(recentTransactionTime);

        // Example - 9 -> Given a list of words, group them by their starting letter (e.g., {A=[Apple, Apricot],B=[Banana]})
        System.out.println("Example - 9");
        List<String> fruits = Arrays.asList("Apple","Apricot","Banana","Papaya","Mango","Watermelon");
        System.out.println(fruits.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.toList())));

        // Example - 10 ->  Check if two lists contain exactly the same elements, regardless of order.
        System.out.println("Example - 10");
        List<String> fruits2 = Arrays.asList("Apple","Mango","Apricot","Banana","Papaya","Watermelon");
        boolean ans = fruits.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).equals(fruits2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
        System.out.println(ans);
    }
}
