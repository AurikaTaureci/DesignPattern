package org.example.designPatterns.abstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        AbstractIceCreamFactory  cup = new CupIceCreamFactory();

        VannilaCup vannilaCup= (VannilaCup)cup.getIceCreamByType(IceCreamEnum.VANNILA);
        vannilaCup.getIceCreamName();

        ChocolateCup chocolateCup =(ChocolateCup)cup.getIceCreamByType(IceCreamEnum.CHOCOLATE);
        chocolateCup.getIceCreamName();


        AbstractIceCreamFactory cone = new ConeIceCreamFactory();

        VannilaCone vannilaCone = (VannilaCone)cone.getIceCreamByType(IceCreamEnum.VANNILA);
        vannilaCone.getIceCreamName();

        ChocolateCone chocolateCone=(ChocolateCone)cone.getIceCreamByType(IceCreamEnum.CHOCOLATE);
        chocolateCone.getIceCreamName();



    }
}
