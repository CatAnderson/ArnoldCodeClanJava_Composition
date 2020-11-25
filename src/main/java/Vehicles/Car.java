package Vehicles;

import Components.Engine;
import Components.Tyres;

public class Car extends Vehicle{

    private Engine engine;

    public Car(double price, String colour, Tyres tyres, Engine engine) {
        super(price, colour, tyres);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
