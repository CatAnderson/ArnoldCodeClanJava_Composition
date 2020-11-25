package Vehicles;

import Components.Engine;
import Components.Tyres;

public class Car extends Vehicle{

    public Car(double price, String colour, Engine engine, Tyres tyres) {
        super(price, colour, engine, tyres);
    }
}
