package HomeWork;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedHW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> mass = new LinkedList<>();

        for (int i = 0; i <n ; i++) {
            mass.add(i+1);
        }

        for (int i = 1; i < mass.size(); i++) {
            mass.remove(i);
        }

        while (mass.size() != 1){
            if(mass.size() %2 == 0) {
                for (int i = 0; i < mass.size(); i++) {
                    mass.remove(i);
                }
            }else {
                for (int i = 1; i < mass.size(); i++) {
                    mass.remove(i);
                }
            }
        }
        System.out.println(mass.get(0));

    }
}
