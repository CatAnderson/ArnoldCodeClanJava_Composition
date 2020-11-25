import Vehicles.Car;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> cars;
    private double till;

    public Dealership(double till) {
        this.till = till;
        this.cars = new ArrayList<>();
    }


    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public int carCount(){
        return this.cars.size();
    }

    public void addVehicle(Vehicle newVehicle) {
        this.cars.add(newVehicle);
    }

    public void removeVehicle() {
        this.cars.remove(0);
    }
}
