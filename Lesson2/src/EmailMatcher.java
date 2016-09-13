import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMatcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        Pattern p = Pattern.compile(".*@(gmail|yandex|mail)\\.(ru|com|su)");
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}
