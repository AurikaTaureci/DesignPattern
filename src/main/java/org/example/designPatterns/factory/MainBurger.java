package org.example.designPatterns.factory;

//Metoda Factory definește o metodă, care ar trebui utilizată pentru crearea de obiecte
// în loc să utilizeze un apel direct al constructorului (operator nou).
// Subclasele pot suprascrie această metodă pentru a schimba clasa de obiecte care vor fi create.
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
