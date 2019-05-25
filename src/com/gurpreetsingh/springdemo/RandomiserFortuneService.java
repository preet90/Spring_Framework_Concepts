package com.gurpreetsingh.springdemo;

import java.util.Random;

public class RandomiserFortuneService implements FortuneService {

    private Random rand;
    private String[] fortuneArray;

    public RandomiserFortuneService() {
        rand = new Random(System.currentTimeMillis());
        fortuneArray = new String[3];
        fortuneArray[0] = "You will meet someone great today!";
        fortuneArray[1] = "The best time to start something new is between 4 and 6 PM!";
        fortuneArray[2] = "You and Your partner will enjoy each other's company today!";
    }

    @Override
    public String getFortune() {
        int n = rand.nextInt(3);
        return fortuneArray[n];
    }

}
