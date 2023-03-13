package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean flag = true;

        System.out.println("inserisci il tuo nome");
        String username = scan.nextLine();

        BankAccount account = new BankAccount((rand.nextInt(1000)+1), username);



        while (flag) {

            System.out.println("scrivi se vuoi: depositare, prelevare, uscire.");
            String action = scan.nextLine();

            if (action.equalsIgnoreCase("depositare")) {
                System.out.println("quanto vuoi depositare?");
                double add = Double.parseDouble(scan.nextLine());
                account.deposit(add);
                System.out.println("saldo contabile: " + account.getBalance());
            } else if (action.equalsIgnoreCase("prelevare")) {
                System.out.println("quanto vuoi prelevare?");
                double less = Double.parseDouble(scan.nextLine());
                account.withdraw(less);
                System.out.println("saldo contabile: " + account.getBalance());
            } else if (action.equalsIgnoreCase("uscire")) {
                flag = !flag;
                System.out.println("uscito");
            }else{
                System.out.println("operazione non valida. Cosa vuoi fare?");
            }
        }

        System.out.println("SASSONE");
        scan.close();
    }
}
