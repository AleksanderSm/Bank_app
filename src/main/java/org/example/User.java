package org.example;

public class User {
    private String name;
    private String surname;
    private String nickname;
    private int pesel;
    private int accountNumber;
    private double balance;

    public User(String name, String surname, int pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.nickname = nickNameGenerator(name, surname);
        this.balance = 100;


    }

    public String nickNameGenerator(String name, String surname) {
        return (name.substring(0, 2) + surname.substring(0, 2));

    }

    public void userDetails() {
        System.out.println("Imie: " + name + "Nazwisko: " + surname + "Numer konta" + accountNumber + "Pesel: " + pesel + "Saldo: " + balance);
    }

    public double deposit(double money) {
        return balance = balance + money;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double money) {

        if (money > balance) {
            System.out.println("Nie wystarczająca ilość pieniedzy na koncie");
        } else {
            balance = balance - money;
        }

        return balance;
    }

}
