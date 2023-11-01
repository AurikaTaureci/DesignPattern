package org.example.designPatterns.factory;

public class BeefBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }

    @Override
    public double getPrice() {
        return 23.99;
    }
}
