package org.example.designPatterns.abstractFactory;

public class ChocolateCone implements IceCream {
    @Override
    public void getIceCreamName() {
        System.out.println("It's a cone with chocolate ice cream");
    }
}
