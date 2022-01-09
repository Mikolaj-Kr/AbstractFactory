package com.company.Mercedes;

import com.company.IVehicle;

public class MercedesTruck implements IVehicle {
    @Override
    public void start() {
        System.out.println("Mercedes truck has been started");
    }
}
