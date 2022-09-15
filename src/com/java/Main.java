package com.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("witaj na losowaniu 6 liczb");
        Set<Integer> wylosowaneLiczby = new HashSet<>();
        List<Integer> wpisaneLiczby = new ArrayList<>();
        List<Integer> trafioneLiczby = new LinkedList<>();
        wylosowaneLiczby = wylosowanieLiczb(6);
        wpisaneLiczby = wpisanieLiczb(10);
        trafioneLiczby = podsumowanie(wpisaneLiczby, wylosowaneLiczby);
        System.out.println("wylosowano" + wylosowaneLiczby);
        System.out.println("trafiono" + trafioneLiczby);

    }


    //sprawdzamy czy wpisane zostały wylosowane


    public static Set<Integer> wylosowanieLiczb(int n) {
        Set<Integer> wylosowane = new HashSet<>();
        while (wylosowane.size() < 6) {
            wylosowane.add((int) (Math.random() * 100 + 1));
        }
        return wylosowane;
    }

    public static List<Integer> wpisanieLiczb(int n) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj 6 liczb");
        List<Integer> wpisane = new ArrayList<>();

        while (wpisane.size() < 6) {
            int liczba = klawiatura.nextInt();
            while (wpisane.contains(liczba)) {
                System.out.println("już taką liczbę wpisano wpisz inną");
                liczba = klawiatura.nextInt();
            }
            wpisane.add(liczba);
        }

        return wpisane;
    }

    public static List<Integer> podsumowanie(List<Integer> wpisane, Set<Integer> wylosowane) {
        List<Integer> trafione = new LinkedList<>();
        //jeżeli wartośc wpisana została wylosowana to dodajemy ją do trafione
        for (Integer wpisanaWartosc : wpisane) {
            if (wylosowane.contains(wpisanaWartosc)) {
                trafione.add(wpisanaWartosc);
            }
            System.out.println(trafione);

        }
        return trafione;
    }
}



