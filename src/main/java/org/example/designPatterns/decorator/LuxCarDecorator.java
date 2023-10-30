package org.example.designPatterns.decorator;

public class LuxCarDecorator extends CarDecorator{

    public LuxCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void aseemble() {
        super.aseemble();
        System.out.println("Masina LuxCarDecorator");
    }
}
