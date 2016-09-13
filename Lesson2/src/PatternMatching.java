import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Azot- on 07.09.2016.
 */
public class PatternMatching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{2}");
        Matcher m = pattern.matcher(a);
        System.out.println(m.matches());
    }
}
