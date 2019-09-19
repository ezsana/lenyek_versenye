package com.codecool.lenyek_versenye;

public class Lepegeto extends Leny {

    private final int maxWaterQuantity;

    Lepegeto(String name) {
        super(name);
        maxWaterQuantity = 12;
        waterQuantity = RandomNumberGenerator.getRandomNumber(1, maxWaterQuantity);
    }

    @Override
    void changeWaterQuantity(Idojaras idojaras) {
        switch (idojaras) {
            case ESOS:
                waterQuantity += 3;
                break;
            case NAPOS:
                waterQuantity -= 2;
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
                reachedDistance += 1;
                break;
            case FELHOS:
                reachedDistance += 2;
                break;
            case NAPOS:
                reachedDistance += 1;
                break;
        }
    }
}
