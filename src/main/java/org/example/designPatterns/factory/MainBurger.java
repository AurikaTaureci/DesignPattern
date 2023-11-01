package org.example.designPatterns.factory;

public class MainBurger {
    public static void main(String[] args) {

        System.out.println("Order BeefBurgerRestaurant");
        Restaurant restaurant = new BeefBurgerRestaurant();
        restaurant.orderBurger();
        System.out.println(restaurant.getPrice());

        System.out.println();
        System.out.println("Order VeggieBurgerRestaurant");
        Restaurant restaurant1 = new VeggieBurgerRestaurant();
        restaurant1.orderBurger();
        System.out.println(restaurant1.getPrice());



    }
}
