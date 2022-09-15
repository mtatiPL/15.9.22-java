package com.java;

import java.util.HashSet;
import java.util.Set;

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


    }
}
