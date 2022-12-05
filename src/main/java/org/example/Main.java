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

        System.out.println("Menu\n 1.Informacje o koncie\n 2.Wplata pieniedzy \n 3.Wyplata pieniedzy \n4.Wyjscie  ");
    }
}