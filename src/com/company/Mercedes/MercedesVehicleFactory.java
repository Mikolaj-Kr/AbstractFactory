package com.company.Mercedes;

import com.company.IVehicle;
import com.company.IVehicleFactory;

public class MercedesVehicleFactory implements IVehicleFactory {
    @Override
    public IVehicle createCar() {
        return new MercedesCar();
    }

    @Override
    public IVehicle createTruck() {
        return new MercedesTruck();
    }
}
