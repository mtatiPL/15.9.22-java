package com.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //losowanie 6 liczb zapiszemy je w tablicy potem w kolekcji
        //wypisywanie 6 liczb
        //sprawdzamy ile trafionych
        System.out.println("witaj na losowaniu 6 liczb");
        //tablica wylosowane

        //wartości w tablicy typu prostego lub złożonego
        //w tablicy nie ma możliwości zmiany jej rozmiaru po jej deklaracji

//kolekcje mogą mieć tylko typy  złożone
        //po zadeklarowaniu można usuwać i dodawac elementy
        Set<Integer> wylosowane = new HashSet<>();
        //zbiór zazwyczaj zawiera elementy bez powtórzeń
        //zbiór zazwyczaj nie ma indeksowanych elementów
        //gdy używamy for ale są powtórzenia to będzie mniej niż 6 a używając while będzie się wykonywać tak długo aż będzie 6 różnych liczb

        while (wylosowane.size() < 6) {
            wylosowane.add((int) (Math.random() * 10 + 1));
        }
        for (int element : wylosowane) {
            System.out.print(element + ", ");
        }
        System.out.println("wylosowanie inaczej");
        System.out.println(wylosowane);
//wpisujemy 6 liczb z klawiatury
        //na razie dowolnie potem bez powtórzeń
        //dodajemy elementy na końcu listy
        Scanner klawiatura = new Scanner(System.in);
        //lista to kolekcja wktórej można zmieniać rozmiar działania programu
        //elementy indeksowane mogą sie powtarzać
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
        System.out.print(wpisane);

    }
}
