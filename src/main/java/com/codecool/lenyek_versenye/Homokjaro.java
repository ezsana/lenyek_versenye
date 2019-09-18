package com.codecool.lenyek_versenye;

public class Homokjaro extends Leny {

    private final int maxWaterQuantity;

    Homokjaro(String name) {
        super(name);
        maxWaterQuantity = 8;
        initialWaterQuantity = RandomNumberGenerator.getRandomNumber(1, maxWaterQuantity);
    }

    @Override
    void changeWaterQuantity(Idojaras idojaras) {
        switch (idojaras) {
            case ESOS:
                waterQuantity += 3;
                break;
            case NAPOS:
                waterQuantity -= 1;
                break;
        }
        if(waterQuantity > maxWaterQuantity) {
            waterQuantity = maxWaterQuantity;
        }
        isLenyAlive();
    }

    @Override
    void changeReachedDistance(Idojaras idojaras){
        switch (idojaras) {
            case NAPOS:
                reachedDistance += 3;
                break;
            case FELHOS:
                reachedDistance += 1;
        }
    }
}
