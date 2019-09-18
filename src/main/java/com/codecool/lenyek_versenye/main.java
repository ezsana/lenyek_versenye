package com.codecool.lenyek_versenye;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        // Initialize lenyek
        List<Leny> lenyek = Arrays.asList(new Szivacs("Szöszi"),
                new Szivacs("Szupi"), new Szivacs("Szivi"),
                new Homokjaro("Huli"), new Homokjaro("Heda"), new Homokjaro("Hilda"),
                new Lepegeto("Lola"), new Lepegeto("Lili"));
        Verseny verseny = new Verseny(20, lenyek);
        verseny.simulateRace();
    }


}
