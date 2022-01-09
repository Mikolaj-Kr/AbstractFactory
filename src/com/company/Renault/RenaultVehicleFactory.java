package com.company.Renault;

import com.company.IVehicle;
import com.company.IVehicleFactory;

public class RenaultVehicleFactory implements IVehicleFactory {
    @Override
    public IVehicle createCar() {
        return new RenaultCar();
    }

    @Override
    public IVehicle createTruck() {
        return new RenaultTruck();
    }
}
