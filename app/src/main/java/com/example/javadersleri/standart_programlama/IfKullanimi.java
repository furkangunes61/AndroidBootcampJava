package com.example.javadersleri.standart_programlama;

public class IfKullanimi {
    public static void main(String[] args) {
        int yas = 17;
        String isim = "Mehmetx";

        if (yas >= 18){
            System.out.println("Reşitsiniz");
        } else {
            System.out.println("Reşit değilsiniz");
        }

        if (isim == "Ahmet"){//equals()
            System.out.println("Merhaba Ahmet");
        } else if (isim == "Mehmet") {
            System.out.println("Merhaba Mehmet");
        } else {
            System.out.println("Tanınmayan kişi");
        }

        String ka = "admin";
        int s = 123456;

        if (ka == "admin" && s == 123456){
            System.out.println("Hoşgeldiniz");
        } else {
            System.out.println("Hatalı giriş");
        }

        int sayi = 11;

        if (sayi == 9 || sayi == 10){
            System.out.println("Sayı 9 veya 10'dur");
        } else {
            System.out.println("Sayı 9 veya 10 değildir");
        }
    }
}
