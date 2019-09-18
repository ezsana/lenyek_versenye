package com.codecool.lenyek_versenye;

public enum Idojaras {

    NAPOS, FELHOS, ESOS;

    protected static Idojaras getDayWeather() {
        Idojaras idojaras = null;
        int i = RandomNumberGenerator.getRandomNumber(1,3);
        switch (i) {
            case 1:
                idojaras = NAPOS;
                break;
            case 2:
                idojaras = FELHOS;
                break;
            case 3:
                idojaras = ESOS;
                break;
        }
        return idojaras;
    }

}
