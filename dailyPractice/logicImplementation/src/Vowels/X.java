package Vowels;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class X {
    public static void main(String[] args) {
        String s = "aeiouaeiou afasfasf";
        Pattern p = Pattern.compile("a|e|i|o|u");
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println(count);

    }
}
