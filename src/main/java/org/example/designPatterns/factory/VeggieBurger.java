package org.example.designPatterns.factory;

public class VeggieBurger implements Burger{

    public double getPrice() {
        return 8.5;
    }
    @Override
    public void prepare() {

        System.out.println("Preparing Veggie Burger...");
    }
}
