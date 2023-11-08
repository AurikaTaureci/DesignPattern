package org.example.designPatterns.abstractFactory;

public class VannilaCup implements IceCream {
    @Override
    public void getIceCreamName() {
        System.out.println("It's a vannila cup ice cream");
    }
}
