package com.company;

public class VehicleFactory {
    private IVehicleFactory iVehicleFactory;

    public VehicleFactory(IVehicleFactory iVehicleFactory) {
        this.iVehicleFactory = iVehicleFactory;
    }

    public IVehicle createCar(){
        return iVehicleFactory.createCar();
    }

    public IVehicle createTruck(){
        return iVehicleFactory.createTruck();
    }
}
