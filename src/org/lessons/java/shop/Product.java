package org.lessons.java.shop;

import java.util.Random;

public class Product {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private static double iva = 22;

    private static double ivaIndex = 1.2;

    Random rand = new Random();
    public Product(){
        codice = rand.nextInt(100);
        nome = "unknown";
        descrizione = "";
        prezzo = 0;
    };

    public Product(String nome, String descrizione, double prezzo){
        codice = rand.nextInt(100);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    };

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzoBase() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPrezzoIva() {
        return (prezzo * ivaIndex);
    }

    public static double getIva() {
        return iva;
    }

    public String getCodex(){
        return (codice + "-" + nome);
    }


    public static void main(String[] args){
        Product penna1 = new Product();
        Product penna2 = new Product("bella", "testo descrizione", 10.45);
        System.out.println("SASSONE");
    }



}
