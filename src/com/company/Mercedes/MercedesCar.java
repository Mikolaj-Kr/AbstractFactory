package com.company.Mercedes;

import com.company.IVehicle;

public class MercedesCar implements IVehicle {
    @Override
    public void start() {
        System.out.println("Mercedes car has been started");
    }
}
