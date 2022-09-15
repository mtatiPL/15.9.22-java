package com.klasa3p.gra;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("witaj na losowaniu 6 liczb");
        gra gra1 = new gra();
        gra1.wpisanieLiczb(8);
        gra1.wylosowanieLiczb(6);
        gra1.podsumowanie();
        System.out.println(gra1.trafioneLiczby);
    }
}






