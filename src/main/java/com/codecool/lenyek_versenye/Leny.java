package com.codecool.lenyek_versenye;

public abstract class Leny {

    protected String name;
    protected boolean elo = true;
    protected int reachedDistance = 0;
    protected int waterQuantity;

    Leny(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    int getReachedDistance() {
        return this.reachedDistance;
    }

    @Override
    public String toString() {
        return "A lény neve: " + this.getName() + ", a megtett táv: " + this.getReachedDistance() + ", vízmennyisége: " +
                this.waterQuantity + ".";
    }
}
