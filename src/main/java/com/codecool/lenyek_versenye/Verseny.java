package com.codecool.lenyek_versenye;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Verseny {

    private List<Leny> lenyek;

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
        Optional<List<Leny>> optionalLenyList = Optional.ofNullable(lenyek);
        if (optionalLenyList.isPresent()) {
            getResultsAfterRace(lenyek);
            System.out.println("A nyertes(ek) pedig: " + getWinner(lenyek).toString());
        } else {
            System.out.println("Unfortunately every plant died.");
        }

    }

    List<Leny> getWinner(List<Leny> lenyekList) {
        int maxDistance = 0;
        for(Leny l : lenyekList) {
            if (maxDistance < l.getReachedDistance()) {
                maxDistance = l.getReachedDistance();
            }
        }
        List<Leny> winners = new ArrayList<>();
        for (Leny l : lenyekList) {
            if (l.getReachedDistance() == maxDistance) {
                winners.add(l);
            }
        }
        return winners;
    }

    private void getResultsAfterRace(List<Leny> lenylist) {
        for (Leny l : lenylist) {
            l.toString();
        }
    }

}
