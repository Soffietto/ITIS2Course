package HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        Pattern p = Pattern.compile("\\D.*\\.jpeg");
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}
