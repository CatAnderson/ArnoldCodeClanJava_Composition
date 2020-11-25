import Components.ElectricEngine;
import Components.Engine;
import Components.Tyres;
import Vehicles.Car;
import Vehicles.ElectricCar;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private HybridCar hybridCar;
    private ElectricEngine electricEngine;
    private Engine engine;
    private Tyres carTyres;


    @Before
    public void setUp() throws Exception {
        customer = new Customer(18643);
        engine = new Engine("1.6", "petrol");
        electricEngine = new ElectricEngine("230 miles");
        carTyres = new Tyres("winter", 4);
        hybridCar = new HybridCar(9500, "Blue", carTyres, engine, electricEngine);
    }


    @Test
    public void hasWallet() {
        assertEquals(18643, customer.getWallet(), 0.01);

    }


}
