package com.codecool.lenyek_versenye;

public abstract class Leny {

    protected String name;
    protected boolean elo = true;
    protected int reachedDistance = 0;
    protected int initialWaterQuantity;
    protected int waterQuantity;

    Leny(String name) {
        this.name = name;
    }

    boolean isLenyAlive() {
        if (waterQuantity <= 0) {
            elo = false;
        }
        return elo;
    }

    abstract void changeWaterQuantity(Idojaras idojaras);

    abstract void changeReachedDistance(Idojaras idojaras);

    void behaviourInRace(Idojaras idojaras) {
        changeWaterQuantity(idojaras);
        if (isLenyAlive()) {
            changeReachedDistance(idojaras);
        }
    }
}
