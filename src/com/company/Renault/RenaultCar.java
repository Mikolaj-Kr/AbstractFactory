package com.company.Renault;

import com.company.IVehicle;

public class RenaultCar implements IVehicle {
    @Override
    public void start() {
        System.out.println("Renault car has been started");
    }
}
