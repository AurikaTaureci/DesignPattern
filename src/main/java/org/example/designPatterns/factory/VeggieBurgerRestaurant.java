package org.example.designPatterns.factory;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger...");
        return new VeggieBurger();
    }

    @Override
    public double getPrice() {
        return 15.98;
    }
}
