package HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        Pattern p = Pattern.compile("(http|https)://(.*)\\.(ru|com|su|info)");
        Matcher m = p.matcher(a);

        if (m.find()) {
            System.out.println("Overall [" + m.group() + "] (from " + m.start() + " to " + m.end() + ")");
        }

        Pattern p1 = Pattern.compile("(http|https)://");
        Matcher m1 = p1.matcher(a);

        if (m1.find()) {
            System.out.println("Protocol [" + m1.group().replace("://", "") + "] (from " + m1.start() + " to " + (m1.end() - 3) + ")");
        }

        Pattern p2 = Pattern.compile("www.+?(:|/)");
        Matcher m2 = p2.matcher(a);

        if (m2.find()) {
            System.out.println("Hostname " + m2.group().substring(0, m2.group().length() - 1) + " (from " + m2.start() + " to " + (m2.end() - 2) + ")");
        }

        Pattern p3 = Pattern.compile(":(\\\\d)+/");
        Matcher m3 = p3.matcher(a);

        if (m3.find()) {
            System.out.println("Port " + m3.group().substring(1, m3.group().length() - 1) + " (from " + (m3.start() + 1) + " to " + (m3.end() - 1) + ")");
        } else {
            System.out.println("No port");
        }
    }
}
