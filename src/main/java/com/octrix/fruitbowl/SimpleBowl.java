package com.octrix.fruitbowl;

import java.util.ArrayList;

public class SimpleBowl {

    private ArrayList<Fruits> fruits = new ArrayList<>();

    /**
     * This is where getters and setters are being defined for the Fruits
     */
    public ArrayList<Fruits> getFruits() {
        return fruits;
    }

    public void addFruits(ArrayList<Fruits> fruits) {
        this.fruits = fruits;
    }
}