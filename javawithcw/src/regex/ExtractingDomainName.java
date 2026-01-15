package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingDomainName {
    public static void main(String[] args) {
        String url = "^(https://)?(www\\.)?[A-Za-z0-9.-]+\\.[A-Za-z0-9]{2,}$";
        Pattern pattern = Pattern.compile(url);

        String[] urlArray = new String[]{"https://www.google.com","http://example.org","https://github.com"};
         for (String u : urlArray){
             Matcher matcher = pattern.matcher(u);
             System.out.println(u+" is Valid Domain : "+matcher.matches());
         }
    }
}
