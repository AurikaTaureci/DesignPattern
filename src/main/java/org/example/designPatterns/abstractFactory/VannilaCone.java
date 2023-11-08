package org.example.designPatterns.abstractFactory;

public class VannilaCone implements IceCream {
    @Override
    public void getIceCreamName() {
        System.out.println("It's a cone with vannila ice cream");
    }
}
