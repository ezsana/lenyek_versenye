package com.codecool.lenyek_versenye;

public class RandomNumberGenerator {

    public static int getRandomNumber(int from, int to) {
        int range = to - from + 1;
        return (int)(Math.random() * range) + from;
    }

}