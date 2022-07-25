package com.octrix.fruitbowl;

import com.octrix.fruitbowl.Fruits;
import com.octrix.fruitbowl.SimpleBowl;

import java.util.ArrayList;

public class MultiLayerBowl {
    private SimpleBowl simpleBowl;

    /*
    Sorting SimpleBowl fruits based on FruitSize Enum
     */
    private ArrayList<Fruits> smallSizeFruitsBasket = new ArrayList<>(20);
    private ArrayList<Fruits> mediumSizeFruitsBasket = new ArrayList<>(10);
    private ArrayList<Fruits> largeSizeFruitsBasket = new ArrayList<>(5);
    public void segragateFruits(){
        ArrayList<Fruits> simpleBowlFruits = new ArrayList<>(simpleBowl.getFruits());
        for(Fruits fruit: simpleBowlFruits){
            if(fruit.getSize() == Constants.FruitSize.SMALL && smallSizeFruitsBasket.size()>0){
                smallSizeFruitsBasket.add(fruit);
            }
            if(fruit.getSize() == Constants.FruitSize.MEDIUM && mediumSizeFruitsBasket.size()>0){
                mediumSizeFruitsBasket.add(fruit);
            }
            if(fruit.getSize() == Constants.FruitSize.LARGE && largeSizeFruitsBasket.size()>0){
                largeSizeFruitsBasket.add(fruit);
            }
        }
    }

    /**
     * This is where getters and setters are being defined for the Fruits
     */
    public SimpleBowl getSimpleBowl() {
        return simpleBowl;
    }

    public void transferSimpleBowlFruits(SimpleBowl simpleBowl) {
        this.simpleBowl = simpleBowl;
    }

    public ArrayList<Fruits> getSmallSizeFruits() {
        return smallSizeFruitsBasket;
    }

    public void setSmallSizeFruits(ArrayList<Fruits> smallSizeFruits) {
        this.smallSizeFruitsBasket = smallSizeFruits;
    }

    public ArrayList<Fruits> getMediumSizeFruits() {
        return mediumSizeFruitsBasket;
    }

    public void setMediumSizeFruits(ArrayList<Fruits> mediumSizeFruits) {
        this.mediumSizeFruitsBasket = mediumSizeFruits;
    }

    public ArrayList<Fruits> getLargeSizeFruits() {
        return largeSizeFruitsBasket;
    }

    public void setLargeSizeFruits(ArrayList<Fruits> largeSizeFruits) {
        this.largeSizeFruitsBasket = largeSizeFruits;
    }
}