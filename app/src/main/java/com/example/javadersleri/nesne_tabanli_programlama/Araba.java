package com.example.javadersleri.nesne_tabanli_programlama;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyorMu;

    public Araba() {//init metodu
        System.out.println("Boş constructor çalıştı");
    }

    public Araba(String renk, int hiz, boolean calisiyorMu) {
        System.out.println("Dolu constructor çalıştı");
        this.renk = renk;//Shadowing
        this.hiz = hiz;
        this.calisiyorMu = calisiyorMu;
    }

    public void calistir() {//Side effect : Yan etki
        calisiyorMu = true;
        hiz = 5;
    }

    public void durdur() {
        calisiyorMu = false;
        hiz = 0;
    }

    public void hizlan(int kacKm) {
        hiz += kacKm; //hiz = hiz + kacKm;
    }

    public void yavasla(int kacKm) {
        hiz -= kacKm; //hiz = hiz - kacKm;
    }

    public void bilgiAl() {
        System.out.println("-------------------------");
        System.out.println("Renk         : " + renk);
        System.out.println("Hız          : " + hiz);
        System.out.println("Çalışıyor Mu : " + calisiyorMu);
    }
}
