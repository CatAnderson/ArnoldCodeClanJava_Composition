import Components.ElectricEngine;
import Components.Engine;
import Components.Tyres;
import Vehicles.Car;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar hybridCar;
    private ElectricEngine electricEngine;
    private Engine engine;
    private Tyres tyres;


    @Before
    public void before(){
        engine = new Engine("1.6", "petrol");
        electricEngine = new ElectricEngine("230 miles");
        tyres = new Tyres("winter", 4);
        hybridCar = new HybridCar(9500, "Blue", tyres, engine, electricEngine);
    }

    @Test
    public void hasPrice(){
        assertEquals(9500, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", hybridCar.getColour());
    }

    @Test
    public void hasEngineSize(){
        assertEquals("1.6", hybridCar.getEngine().getSize());
    }

    @Test
    public void hasEngineFuelType(){
        assertEquals("petrol", hybridCar.getEngine().getFuelType());
    }

    @Test
    public void hasTyreType(){
        assertEquals("winter", hybridCar.getTyres().getType());
    }

    @Test
    public void hasNumberOfTyres(){
        assertEquals(4, hybridCar.getTyres().getNrOfTyres());
    }

    @Test
    public void hasElectricEngineRange(){
        assertEquals("230 miles", hybridCar.getElectricEngine().getRange());
    }

}
