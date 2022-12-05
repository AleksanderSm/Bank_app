package org.example;

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
                user1.userDetails();
                break;
            case 2:
                System.out.println("Ile chcesz wplacic pieniedzy?");
                double moneyToDeposit= scanner.nextDouble();
                user1.deposit(moneyToDeposit);
                System.out.println("Saldo twojego konta wynosi: "+user1.getBalance());
                break;
            case 3:
                System.out.println("Wyplata pieniedzy ");
                double moneyWithdraw = scanner.nextDouble();
                user1.withdraw(moneyWithdraw);
                System.out.println("Saldo Twojego konta wynosi"+user1.getBalance());
                break;
            case 4:
                System.out.println("Wyjscie");
                break;

        }

    }
}