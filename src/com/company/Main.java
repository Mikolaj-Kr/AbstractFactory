package com.company;

import com.company.Mercedes.MercedesVehicleFactory;
import com.company.Renault.RenaultVehicleFactory;

public class Main {

    public static void main(String[] args) {
        IVehicleFactory mercedesVehicleFactory = new MercedesVehicleFactory();
        IVehicleFactory renaultVehicleFactory = new RenaultVehicleFactory();

        IVehicle mercedesCar = mercedesVehicleFactory.createCar();
        IVehicle mercedesTruck = mercedesVehicleFactory.createTruck();

        IVehicle renaultCar = renaultVehicleFactory.createCar();
        IVehicle renaultTruck = renaultVehicleFactory.createTruck();

        mercedesCar.start();
        mercedesTruck.start();

        renaultCar.start();
        renaultTruck.start();

    }
}
