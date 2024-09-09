package com.example.javadersleri.nesne_tabanli_programlama;

public class ArabaMain {
    public static void main(String[] args) {
        //Nesne oluşturma
        Araba bmw = new Araba("Mavi",100,true);
        //Değer atama
        //bmw.renk = "Mavi";
        //bmw.hiz = 100;
        //bmw.calisiyorMu = true;

        //Değer okuma
        bmw.bilgiAl();
        bmw.durdur();
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();
        bmw.hizlan(100);
        bmw.bilgiAl();
        bmw.yavasla(40);
        bmw.bilgiAl();

        Araba sahin = new Araba();
        sahin.renk = "Beyaz";
        sahin.hiz = 0;
        sahin.calisiyorMu = false;

        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.durdur();
        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.hizlan(50);
        sahin.bilgiAl();
        sahin.yavasla(30);
        sahin.bilgiAl();
    }
}
