package Components;

public class Engine {

    private String size;
    private String fuelType;


    public Engine (String size, String fuelType){
        this.size = size;
        this.fuelType = fuelType;
    }


    public void setSize(String newSize) {
        this.size = newSize;
    }

    public void setFuelType(String newFuelType) {
        this.fuelType = newFuelType;
    }

    public String getSize() {
        return size;
    }

    public String getFuelType() {
        return fuelType;
    }





}
