package com.octrix.fruitbowl;

import java.util.ArrayList;

public class Segragator {

    public void displayFruitsFromBasket(ArrayList<Fruits> fruitArrayList){
        for(Fruits fruit : fruitArrayList){
            System.out.println("The Fruit is: "+fruit.getName()+" .The Color of the Fruit is: "+fruit.getFruitColor()+
                    " .The Flavor of the Fruit is: "+fruit.getFlavorType()+" .The Size of the Fruit is: "+fruit.getSize());

        }
    }

    public static void main(String[] args) {
        SimpleBowl simpleBowl = new SimpleBowl();
        MultiLayerBowl multiLayerBowl = new MultiLayerBowl();

        ArrayList<Fruits> simpleBowlFruits = new ArrayList<>();

        //Adding Fruits of different sizes in the simple bowl without segragation.
        simpleBowlFruits.add(new Fruits("pears","green","sweet",Constants.FruitSize.MEDIUM));
        simpleBowlFruits.add(new Fruits("cherry","red","sweet",Constants.FruitSize.SMALL));
        simpleBowlFruits.add(new Fruits("orange","tangerine","citrus",Constants.FruitSize.LARGE));
        simpleBowlFruits.add(new Fruits("grapes","green","sweet and sour",Constants.FruitSize.SMALL));
        simpleBowlFruits.add(new Fruits("banana","yellow","sweet",Constants.FruitSize.LARGE));

        //Transferring Simple Bowl to Multi Layer Bowl
        simpleBowl.addFruits(simpleBowlFruits);
        multiLayerBowl.transferSimpleBowlFruits(simpleBowl);
        multiLayerBowl.segragateFruits();

        //Sorted Fruits are displayed below.
        Segragator segragator = new Segragator();
        System.out.println("Fruits in the Top Basket are Small fruits");
        segragator.displayFruitsFromBasket(multiLayerBowl.getSmallSizeFruits());
        System.out.println("The remaining space in top basket is: "+ multiLayerBowl.getSmallSizeFruits().size());
        System.out.println("Fruits in the Top Basket are Medium fruits");
        segragator.displayFruitsFromBasket(multiLayerBowl.getMediumSizeFruits());
        System.out.println("The remaining space in middle basket is: "+ multiLayerBowl.getMediumSizeFruits().size());
        System.out.println("Fruits in the Top Basket are Large fruits");
        segragator.displayFruitsFromBasket(multiLayerBowl.getLargeSizeFruits());
        System.out.println("The remaining space in bottom basket is: "+ multiLayerBowl.getLargeSizeFruits().size());
    }
}