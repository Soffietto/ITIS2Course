package HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //Вводим кол-во строк
        boolean checker = true;
        String[] mass = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextLine();
        }

        Pattern p1 = Pattern.compile("\\/\\/.*");
        Pattern p2 = Pattern.compile("\\/\\*.*");
        Pattern p3 = Pattern.compile(".*\\*\\/");
        Pattern p4 = Pattern.compile("\\/\\*.+?\\*\\/");
        Pattern p5 = Pattern.compile("\\/\\*.*\\*\\/.*");

        for (int i = 0; i < mass.length; i++) {

            Matcher m1 = p1.matcher(mass[i]);
            Matcher m2 = p2.matcher(mass[i]);
            Matcher m3 = p3.matcher(mass[i]);
            Matcher m4 = p4.matcher(mass[i]);
            Matcher m5 = p5.matcher(mass[i]);

            if (!m1.matches()) {
                if (checker && (!m2.matches() || m5.matches())) {
                    System.out.println(m4.replaceAll(""));
                } else {
                    checker = false;
                }
                if (m3.matches() && !checker) {
                    checker = true;
                }
            }
        }
    }
}

