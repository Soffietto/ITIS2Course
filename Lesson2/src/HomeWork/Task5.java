package HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] mass = new String[n];
        in.nextLine();

        for (int i = 0; i < n; i++) {
            mass[i] = in.nextLine();
        }

        Pattern p = Pattern.compile("0*|1*|1(01)*|0(10)*|(01)*|(10)*");

        for (int i = 0; i < n; i++) {
            Matcher m = p.matcher(mass[i]);
            if (m.matches()) System.out.print((i + 1) + " ");
        }
    }
}
