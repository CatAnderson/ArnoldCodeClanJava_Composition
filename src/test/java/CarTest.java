import Components.Engine;
import Components.Tyres;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private Engine engine;
    private Tyres tyre;

    @Before
    public void before(){
        engine = new Engine("1.6", "petrol");
        tyre = new Tyres("winter", 4);
        car = new Car(9500, "Blue", engine, tyre );
    }

    @Test
    public void hasPrice(){
        assertEquals(9500, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasEngineSize(){
        assertEquals("1.6", car.getEngine().getSize());
    }

    @Test
    public void hasEngineFuelType(){
        assertEquals("petrol", car.getEngine().getFuelType());
    }

    @Test
    public void hasTyreType(){
        assertEquals("winter", car.getTyres().getType());
    }

    @Test
    public void hasNumberOfTyres(){
        assertEquals(4, car.getTyres().getNrOfTyres());
    }

}
