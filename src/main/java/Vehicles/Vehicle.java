package Vehicles;

import Components.Engine;
import Components.Tyres;

public abstract class Vehicle {

     private double price;
     private String colour;
     private Engine engine;
     private Tyres tyres;


    public Vehicle(double price, String colour, Engine engine, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine newEngine) {
        this.engine = newEngine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres newTyres) {
        this.tyres = newTyres;
    }
}
