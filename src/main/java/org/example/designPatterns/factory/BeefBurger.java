package org.example.designPatterns.factory;

public class BeefBurger implements Burger{

    public double getPrice() {
        return 8.5;
    }
    public void prepare() {

        System.out.println("Preparing Beef Burger...");
    }
}
