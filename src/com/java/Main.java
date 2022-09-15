package com.java;
public class Main {
    public static void main(String[] args) {
        //losowanie 6 liczb zapiszemy je w tablicy potem w kolekcji
        //wypisywanie 6 liczb
        //sprawdzamy ile trafionych
        System.out.println("witaj na losowaniu 6 liczb");
        //tablica wylosowane
        int wylosowane[]=new int [6];
        //wartości w tablicy typu prostego lub złożonego
        for(int i=0;i<wylosowane.length;i++){
            wylosowane[i]=(int)(Math.random()*100+1);

        }
        for (int element:wylosowane){
            System.out.print(element+", ");
        }


    }
}