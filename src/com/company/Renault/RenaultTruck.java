package com.company.Renault;

import com.company.IVehicle;

public class RenaultTruck implements IVehicle {
    @Override
    public void start() {
        System.out.println("Renault truck has been started");
    }
}
