package org.example.designPatterns.abstractFactory;

public class CupIceCreamFactory extends AbstractIceCreamFactory{
    @Override
    public IceCream getIceCreamByType(IceCreamEnum iceCreamEnum) {
        switch (iceCreamEnum){
            case CHOCOLATE: return  new ChocolateCup();
            case VANNILA:return new VannilaCup();
            default:return null;
        }

    }
}
