package org.example.designPatterns.decorator;

public class SportCarDecorator extends CarDecorator{

    public SportCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void aseemble() {
        super.aseemble();
        System.out.println("Sports car");
    }
}
