package org.example.designPatterns.bulder;

public class MainBuilder {
    public static void main(String[] args) {
        House.BasicHouse basicHouse = new House.BasicHouse();
        House  house = new House.HouseBuilder(basicHouse)
                .withFancyStatues(new House.FancyStatues())
                .withGarage(new House.Garage())
                .withSwimmingPool(new House.SwimmingPool())
                .withGarden(new House.Garden())
                .build();

    }
}
