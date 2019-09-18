package com.codecool.lenyek_versenye;

public class Szivacs extends Leny {

    private final int maxWaterQuantity;

    Szivacs(String name) {
        super(name);
        maxWaterQuantity = 20;
        this.initialWaterQuantity = RandomNumberGenerator.getRandomNumber(1, maxWaterQuantity);
    }

    @Override
    void changeWaterQuantity(Idojaras idojaras) {
        switch (idojaras) {
            case ESOS:
                waterQuantity += 6;
                break;
            case NAPOS:
                waterQuantity -= 4;
                break;
            case FELHOS:
                waterQuantity -= 1;
        }
        if(waterQuantity > maxWaterQuantity) {
            waterQuantity = maxWaterQuantity;
        }
        isLenyAlive();
    }

    @Override
    void changeReachedDistance(Idojaras idojaras){
        switch (idojaras) {
            case ESOS:
                reachedDistance += 3;
                break;
            case FELHOS:
                reachedDistance += 1;
                break;
        }
    }
}