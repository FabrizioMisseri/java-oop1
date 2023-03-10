package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("inserisci il tuo nome");
        String username = scan.nextLine();

        BankAccount account = new BankAccount((rand.nextInt(1000)+1), username);


        System.out.println("SASSONE");
        scan.close();
    }
}
