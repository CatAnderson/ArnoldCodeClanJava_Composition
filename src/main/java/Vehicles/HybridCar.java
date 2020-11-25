package Vehicles;

import Components.ElectricEngine;
import Components.Engine;
import Components.Tyres;

public class HybridCar extends Vehicle{

    private Engine engine;
    private ElectricEngine electricEngine;


    public HybridCar(double price, String colour, Tyres tyres, Engine engine, ElectricEngine electricEngine) {
        super(price, colour, tyres);
        this.engine = engine;
        this.electricEngine = electricEngine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ElectricEngine getElectricEngine() {
        return electricEngine;
    }

    public void setElectricEngine(ElectricEngine electricEngine) {
        this.electricEngine = electricEngine;
    }
}
