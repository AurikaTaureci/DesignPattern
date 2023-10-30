package org.example.designPatterns.decorator;

public class CarDecorator implements Car{

    public final Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void aseemble() {
        car.aseemble();
        System.out.println("Car Decorator");

    }
}
