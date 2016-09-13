package Notebook;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Note> mass = new ArrayList<Note>();
        String command = in.nextLine();

        if (command.equals("Add")) {
            add(mass);
        } else if (command.equals("Delete")) {
            delete(mass);
        }
    }

    private static void add(ArrayList<Note> mass) {
        System.out.println("Введите имя, фамилию, отчество");
        Note newNote = new Note(in.next(), in.next(), in.next());
        System.out.println("Введите запись");
        newNote.setNote(in.next());
        mass.add(newNote);
    }

    private static void delete(ArrayList<Note> mass) throws FileNotFoundException {
        System.out.println("Введите ФИО удаляемой записи");
        String checker = in.next();
        if (mass.size() != 0) {
            for (Note a : mass) {
                if (a.surname.equals(checker))
                    mass.remove(a);
            }
        } else {
            throw new FileNotFoundException("Книга пуста");
        }
    }

    private static String get(ArrayList<Note> mass, String a) {
        a = in.nextLine();
        if (mass.size() == 0) {
            a = "Книга пуста";
        } else {
            for (Note azat : mass) {
                if (azat.surname.equals(a)) {
                    a= azat.getNote();
                }
            }
        }
        return a;
    }


    private static int compare(String a, String b){
        for (int i = 0; i < a.length(); i++) {
            if (Character.getNumericValue(a.charAt(i)) < Character.getNumericValue(b.charAt(i))) {
                return 1;
            } else if (Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i))) {
                return -1;
            }
        }
        return 0;
    }

}

    // В кругу стоят n человек от 1 до n, при ведении счёта по гругу вычитается каждый второй человек, пока не останется 1. Составить 2 программы которые реализуют этот процесс, Array и LinkedHW
