package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingDatesFromString {
    public static void main(String[] args) {
        String url = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(url);

        String string = "On 02/05/2025 An old man said That the world will end on 01/01/2026";
        Matcher matcher = pattern.matcher(string);
        while(matcher.find()){
            System.out.println("Matched : "+matcher.group());
        }
    }
}
