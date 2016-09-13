import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Azot- on 07.09.2016.
 */
public class EnvyMatcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        Pattern p = Pattern.compile("(.+?):(.+)(\\n|&)");

        Matcher m = p.matcher(a);
        m.group(1);
        m.group(2);
        System.out.println(m.matches());

    }
}
