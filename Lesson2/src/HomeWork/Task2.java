package HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        Pattern p = Pattern.compile("([0|1][0-9])|(2[0-3]):\\d\\d");
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}
