package com.codecool.lenyek_versenye;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Verseny {

    private List<Leny> lenyek = new ArrayList<>();

    private int napokSzama;
    private Idojaras idojaras;

    Verseny(int napokSzama, List<Leny> lenyek) {
        this.lenyek = lenyek;
        this.napokSzama = napokSzama;
    }


    void simulateRace() {
        for (int i = 0; i < napokSzama; i++) {
            idojaras = Idojaras.getDayWeather();
            for (Leny l: lenyek) {
                l.behaviourInRace(idojaras);
            }
            lenyek = lenyek.stream().filter(leny -> leny.isLenyAlive()).collect(Collectors.toList());
        }

    }

}
