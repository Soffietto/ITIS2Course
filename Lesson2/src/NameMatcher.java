import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Azot- on 07.09.2016.
 */
public class NameMatcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        Pattern p = Pattern.compile("[A-Z][a-z]*\\s[A-Z][a-z]*\\s[A-Z][a-z]*");
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}
