package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingHashtags {
    public static void main(String[] args) {
        String regex = "#\\w+";
        Pattern pattern = Pattern.compile(regex);

        String tweet = "Learning #Java #Regex is fun! #Coding #Development";
        Matcher matcher = pattern.matcher(tweet);

        while(matcher.find()){
            System.out.println("Matched : "+matcher.group());
        }


    }
}
