package org.lessons.java.bank;

public class BankAccount {
//    - numero di conto
//    - nome del proprietario
//    - saldo

    private int number;
    private String username;
    private double balance;

    public BankAccount(int number, String username){
        this.number = number;
        this.username = username;
        this.balance = 0;
    };

    public int getNumber() {
        return number;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double add){
        this.balance += add;
    }

    public void withdraw(double less){
        if (this.balance >= less){
            this.balance -= less;
        }else {
            System.out.println("fondi insufficienti");
        }
    }
}
