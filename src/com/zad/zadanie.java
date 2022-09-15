package com.zad;

import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        double tablica[] = new double[10];
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj cyfry");
        double liczba = 1;
        for (int i = 0; i < 10; i++) {

            liczba = klawiatura.nextInt();
            tablica[i] = liczba;
            System.out.print(" " + tablica[i] + " ");

            tablica[i] = Math.sqrt(liczba);
            System.out.print(" " + tablica[i] + " ");

        }


    }


}



