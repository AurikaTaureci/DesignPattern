package org.example.designPatterns.decorator;

public class MainDecorator {
    public static void main(String[] args) {

        Car basicCar = new BasicCar();
        Car sportCar = new SportCarDecorator(basicCar);
        Car luxSportCar = new LuxCarDecorator(sportCar);

        Car lux2Sportscar = new LuxCarDecorator(basicCar);

        System.out.println("----Basic Car-----");
        basicCar.aseemble();

        System.out.println("----Sports Car-----");
        sportCar.aseemble();

        System.out.println("----Lux Car-----");
        luxSportCar.aseemble();

        System.out.println("---- Car 2 lux-----");
        lux2Sportscar.aseemble();
    }
}
