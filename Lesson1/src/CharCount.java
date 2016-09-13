import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt = "Лабораторная работа";
        char[] mass = txt.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < mass.length; i++) {
            if (!map.containsKey(mass[i])) {
                map.put(mass[i], 1);
            } else {
                map.put(mass[i], map.get(mass[i]) + 1);
            }
        }

        ArrayList checker = new ArrayList();

        for (int i = 0; i < mass.length; i++) {
            if(!checker.contains(mass[i]))
            System.out.println("Буква " + mass[i] + " встечается " + map.get(mass[i]));
            checker.add(mass[i]);
        }

    }
}
