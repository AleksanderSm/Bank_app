package org.example;

public class User {
    private String name;
    private String surname;
    private String nickname;
    private int pesel;
    private int accountNumber;
    private double balance=100;

    public User(String name, String surname, String nickname, int pesel, int accountNumber) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;


    }
}
