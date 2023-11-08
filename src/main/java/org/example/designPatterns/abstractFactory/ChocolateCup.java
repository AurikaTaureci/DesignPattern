package org.example.designPatterns.abstractFactory;

public class ChocolateCup implements IceCream {
    @Override
    public void getIceCreamName() {
        System.out.println("It's a chocoltate cup ice cream");
    }
}
