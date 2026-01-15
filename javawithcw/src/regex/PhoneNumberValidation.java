package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String regex = "((\\+[0-9]{1,3}[-.]?)?[0-9]{10})";
        Pattern pattern = Pattern.compile(regex);

        String numbers = "+91-9876543210 +1 9876543210 +123.9876543210 9876543210 ++91-9876543210 +9876-9876543210 987654321";
        Matcher matcher = pattern.matcher(numbers);
        while(matcher.find()){
            System.out.println("Matched : "+matcher.group());
        }
    }
}
