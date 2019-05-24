public class LandVehicles extends Vehicles {

    private int numberOfWheels;
    private String fuel;
    private String purpose;

    public LandVehicles(String manufacturer, int capacity, int numberOfWheels, String fuel, String purpose) {
        super(manufacturer, capacity);
        this.numberOfWheels = numberOfWheels;
        this.fuel = fuel;
        this.purpose = purpose;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void printVehicleDetails(){


        System.out.println(" Type: "+LandVehicles.class.getName()+" Manufacturer: "+getManufacturer()+" Capacity: "+getCapacity()+" Number of Wheels: "+getNumberOfWheels()+" Type of Fuel: "+getFuel()+
                " Purpose: "+getPurpose());


    }
}
