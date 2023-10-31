package org.example.designPatterns.prototype;

import java.util.List;
//Prototype: permite copierea obiectelor existente, fără a face codul dependent de respectiva clasă
public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle a = new Vehicle();
        a.insertData();

        Vehicle b = (Vehicle) a.clone();
        List<String> list = b.getVehicleList();
        list.add("Honda new Amaze");

        System.out.println(a.getVehicleList());//[Honda, Audi A4, Hyundai, BMW, Renault]
        System.out.println(list);//[Honda, Audi A4, Hyundai, BMW, Renault, Honda new Amaze]

        b.getVehicleList().remove("Audi A4");
        System.out.println(list);//[Honda, Hyundai, BMW, Renault, Honda new Amaze]
        System.out.println(a.getVehicleList());//[Honda, Audi A4, Hyundai, BMW, Renault]
    }
}
