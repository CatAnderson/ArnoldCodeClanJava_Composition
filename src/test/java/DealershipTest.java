import Components.ElectricEngine;
import Components.Engine;
import Components.Tyres;
import Vehicles.Car;
import Vehicles.ElectricCar;
import Vehicles.HybridCar;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car car;
    private HybridCar hybridCar;
    private ElectricCar electricCar;
    private ElectricEngine electricEngine;
    private Engine engine;
    private Tyres carTyres;


    @Before
    public void before(){
        dealership = new Dealership(50000);
        engine = new Engine("1.6", "petrol");
        electricEngine = new ElectricEngine("230 miles");
        carTyres = new Tyres("winter", 4);
        car = new Car(150000, "yellow", carTyres, engine );
        hybridCar = new HybridCar(9500, "Blue", carTyres, engine, electricEngine);
        electricCar = new ElectricCar(25000, "purple", carTyres, electricEngine);
    }

    @Test
    public void hasNoCars(){
        assertEquals(0, dealership.carCount());
    }

    @Test
    public void hasCars(){
        dealership.addVehicle(car);
        dealership.addVehicle(hybridCar);
        dealership.addVehicle(electricCar);
        assertEquals(3, dealership.carCount());
    }

    @Test
    public void canRemoveVehicle(){
        dealership.addVehicle(car);
        dealership.addVehicle(hybridCar);
        dealership.addVehicle(electricCar);
        dealership.removeVehicle();
        assertEquals(2, dealership.carCount());
    }

}
