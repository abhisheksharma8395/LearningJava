package streams_api.example_question.echoweave_encryption;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String regex = "^[A-Za-z]+$";
            Pattern pattern = Pattern.compile(regex);
            System.out.print("Input : ");
            String input = scanner.next();
            System.out.print("\n");
            Matcher matcher = pattern.matcher(input);
            if(!matcher.matches()){
                System.out.println(input+" is an invalid input");
                return;
            }
            input = input.toUpperCase();
            System.out.println("Uppercase : "+input);
            Map<Character,Integer> map = input.chars().
                    mapToObj(c -> (char) c).
                    collect(
                            Collectors.toMap(k-> k,v->1,(x,y) -> x+y)
                    );

            System.out.println("Frequency : ");
            input.chars().
                    mapToObj(c -> (char) c).
                    distinct().
                    forEach(x-> {
                        System.out.print(x+"("+map.get(x)+")"+", ");
                    });

            System.out.println("\nGrouping : ");
            System.out.print("Even Frequency -> ");
            System.out.println(input.chars()
                    .mapToObj(c -> (char) c)
                    .distinct().
                    filter(c -> map.get(c) % 2 == 0)
                    .toList()
            );

            String group1 = input.chars().
                    mapToObj(c -> String.valueOf((char) c))
                    .distinct().
                    filter(c -> map.get(c.charAt(0))%2==0)
                    .collect(Collectors.joining());

            String group2 = input.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .distinct().
                    filter(c -> map.get(c.charAt(0))%2!=0)
                    .collect(Collectors.joining());

            System.out.print("Odd Frequency -> ");
            System.out.println(input.chars()
                    .mapToObj(c -> (char) c)
                    .distinct().
                    filter(c -> map.get(c) % 2 != 0).
                    toList());

            System.out.println("Initial build : ");
            System.out.println(group1+group2);

            HashSet<Character> set = new HashSet<>();
            int countOfSingleOccurrenceChar = 0;
            StringBuilder singleOccurrence = new StringBuilder();
            StringBuilder remainingOccurrence = new StringBuilder();
            for(char ch : input.toCharArray()){
                if(map.get(ch) > 1 && !set.contains(ch)){
                    int count = map.get(ch) - 1;
                    for(int i = 0;i<count;i++){
                        remainingOccurrence.append(ch);
                    }
                    set.add(ch);
                }
                else if(map.get(ch) == 1){
                    singleOccurrence.append(ch);
                    countOfSingleOccurrenceChar++;
                }
            }

            StringBuilder stringBuilder = new StringBuilder(group1);
            stringBuilder.append(group2);

            System.out.println("Append remaining occurrences : ");
            System.out.print(remainingOccurrence+" -> ");
            stringBuilder.append(remainingOccurrence);
            System.out.println(stringBuilder);

            System.out.println("Single-Occurrence characters : ");
            System.out.println(singleOccurrence+" -> count = "+countOfSingleOccurrenceChar);
            System.out.println("Insert "+countOfSingleOccurrenceChar+" at middile : ");
            if(stringBuilder.length() % 2 == 0) {
                stringBuilder.insert(stringBuilder.length() / 2, countOfSingleOccurrenceChar);
            }
            else{
                stringBuilder.insert((stringBuilder.length() / 2)+1, countOfSingleOccurrenceChar);
            }
            System.out.println(stringBuilder);
        }

    }
}
