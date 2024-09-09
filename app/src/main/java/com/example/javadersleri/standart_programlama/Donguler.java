package com.example.javadersleri.standart_programlama;

public class Donguler {
    public static void main(String[] args) {
        //Loop - Döngüler
        //1,2,3
        for (int i = 1; i < 4; i++) {
            System.out.println("Döngü 1: " + i);
        }

        //10 --> 20 , 5'er artış
        for (int i = 10; i < 21; i += 5) {
            System.out.println("Döngü 2: " + i);
        }

        //20 --> 10 , 5'er azalış
        for (int i = 20; i > 9; i -= 5) {
            System.out.println("Döngü 3: " + i);
        }

        //1,2,3
        int sayac = 1;
        while (sayac < 4) {
            System.out.println("Döngü 4: " + sayac);
            sayac++;//sayac = sayac +1;//sayac+=1;
        }

        //1,2,3,5
        for (int i = 1; i < 6; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Döngü 5: " + i);
        }

        //1,2,3,5
        for (int i = 1; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Döngü 6: " + i);
        }
    }
}
