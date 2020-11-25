package Vehicles;

import Components.ElectricEngine;
import Components.Engine;
import Components.Tyres;

public class ElectricCar extends Vehicle {

    private ElectricEngine electricEngine;

    public ElectricCar(double price, String colour, Tyres tyres, ElectricEngine electricEngine) {
        super(price, colour, tyres);
        this.electricEngine = electricEngine;
    }
}

