package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayHW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean checker = true;
        ArrayList<Integer> mass = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            mass.add(i+1);
        }

        if(mass.size() % 2 == 0)
            checker = true;
        else
            checker = false;

        for (int i = 1; i < mass.size(); i++) {
            mass.remove(i);
        }

        while (mass.size() != 1){
                for (int i = 1; i < mass.size(); i++) {
                    mass.remove(i);
                }
                for (int i = 0; i < mass.size(); i++) {
                    mass.remove(i);
                }
            }
        System.out.println(mass.get(0));
    }

}
