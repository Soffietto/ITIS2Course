package HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        Pattern p = Pattern.compile("<.+?>");
        Matcher m = p.matcher(a);
        String result = m.replaceAll("");
        System.out.println(result);
    }
}
