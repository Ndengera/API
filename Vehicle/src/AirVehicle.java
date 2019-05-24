import java.awt.*;

public class AirVehicle extends Vehicles {

    private int numberOfEngines;
    private String Purpose;

    public AirVehicle(String manufacturer, int capacity, int numberOfEngines, String purpose) {
        super(manufacturer, capacity);
        this.numberOfEngines = numberOfEngines;
        Purpose = purpose;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String purpose) {
        Purpose = purpose;
    }

     @Override
    public void printVehicleDetails(){

        System.out.println(" Type: "+AirVehicle.class.getName()+" Manufacturer: "+getManufacturer()+" Capacity: "+getCapacity()+" Number of Engines: "+getNumberOfEngines()+" Purpose: "+getPurpose());

    }
}
