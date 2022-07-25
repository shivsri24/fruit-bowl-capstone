package com.octrix.fruitbowl;

public class Fruits {
    private String fruitName;
    private String flavorType;
    private String fruitColor;
    private Constants.FruitSize size;

    public Fruits(String name, String colour, String flavorType, Constants.FruitSize size){
        this.fruitName = name;
        this.fruitColor = colour;
        this.flavorType = flavorType;
        this.size = size;
    }

    /**
     * This is where getters and setters are being defined for the Fruits
     */
    public String getName() {
        return fruitName;
    }

    public void setName(String name) {
        this.fruitName = name;
    }

    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public Constants.FruitSize getSize() {
        return size;
    }

    public void setSize(Constants.FruitSize size) {
        this.size = size;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }
}