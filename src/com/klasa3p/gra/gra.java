package com.klasa3p.gra;

import java.util.*;

public class gra {
    //modyfikatory dostepu
    //dostępne wszędzie-public
    //brak-dostępne tylko w pakiecie
    //private-dostępne tylko w klasie
    //protected-w klasie i klasach potomnych oraz w pakiecie
    //używanie private to hermetyzacja
    private Set<Integer> wylosowaneLiczby = new HashSet<>();
    private List<Integer> wpisaneLiczby = new ArrayList<>();
    public List<Integer> trafioneLiczby = new LinkedList<>();

    public void wylosowanieLiczb(int n) {

        while (wylosowaneLiczby.size() < 6) {
            wylosowaneLiczby.add((int) (Math.random() * 100 + 1));
        }

    }

    public void wpisanieLiczb(int n) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj 6 liczb");


        while (wpisaneLiczby.size() < n) {
            int liczba = klawiatura.nextInt();
            while (wpisaneLiczby.contains(liczba)) {
                System.out.println("już taką liczbę wpisano wpisz inną");
                liczba = klawiatura.nextInt();
            }
            wpisaneLiczby.add(liczba);
        }


    }

    public void podsumowanie() {

        //jeżeli wartośc wpisana została wylosowana to dodajemy ją do trafione
        for (Integer wpisanaWartosc : wpisaneLiczby) {
            if (wylosowaneLiczby.contains(wpisanaWartosc)) {
                trafioneLiczby.add(wpisanaWartosc);
            }


        }

    }
}

