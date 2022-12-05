package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym banku");
        System.out.println("Wpisz nazwe uzytkownika");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Wprowadz nazwisko");
        String surname=scanner.nextLine();
        System.out.println("Wprowadz pesel");
        int pesel=scanner.nextInt();

        User user1=new User(name, surname, pesel);
        System.out.println("Menu\n 1.Informacje o koncie\n 2.Wplata pieniedzy\n 3.Wyplata pieniedzy\n 4.Wyjscie  ");
        System.out.println("Ktora opcje wybierasz?");
        int selectNumer = scanner.nextInt();

        switch (selectNumer){
            case 1:
                System.out.println("Informacja o koncie");
                break;
            case 2:
                System.out.println("Wplata pieniedzy");
                break;
            case 3:
                System.out.println("Wyplata pieniedzy ");
                break;
            case 4:
                System.out.println("Wyjscie");
                break;

        }

    }
}