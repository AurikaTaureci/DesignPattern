package org.example.designPatterns.abstractFactory;

public class ConeIceCreamFactory extends AbstractIceCreamFactory{
    @Override
    public IceCream getIceCreamByType(IceCreamEnum iceCreamenum) {
        switch (iceCreamenum){
            case CHOCOLATE:return new ChocolateCone();
            case VANNILA: return new VannilaCone();
            default:return null;

            }
        }
    }

