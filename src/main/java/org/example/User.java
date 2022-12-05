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
        this.nickname=nickNameGenerator(name, surname);
        this.balance=100;


    }
    public String nickNameGenerator(String name, String surname){
        return (name.substring(0,2)+surname.substring(0,2));

    }

}
