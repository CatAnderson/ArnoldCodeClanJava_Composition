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
}
