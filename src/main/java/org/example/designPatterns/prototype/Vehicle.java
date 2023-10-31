package org.example.designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{

    private final List<String> vehicleList;
    public Vehicle() {
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle(List<String> list) {
        this.vehicleList = list;
    }

    public void insertData() {
        vehicleList.add("Honda");
        vehicleList.add("Audi A4");
        vehicleList.add("Hyundai");
        vehicleList.add("BMW");
        vehicleList.add("Renault");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        List<String> tempList = new ArrayList<String>();

        tempList.addAll(this.getVehicleList());
        return new Vehicle(tempList);
    }
}

