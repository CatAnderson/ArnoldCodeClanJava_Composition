import Vehicles.HybridCar;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Vehicle> cars;
    private double wallet;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.cars = new ArrayList<>();
    }


    public double getWallet() {
        return wallet;
    }

    public void setWallet(double newWallet) {
        this.wallet = newWallet;
    }

    public void addVehicle(Vehicle vehicle) {
        this.cars.add(vehicle);
    }

    public void removeVehicle() {
        this.cars.remove(0);
    }

    public int carCount() {
        return this.cars.size();
    }
}
