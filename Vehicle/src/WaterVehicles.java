public class WaterVehicles extends Vehicles {
    private int numberofPropellers;
    private String Deep;


    public WaterVehicles(String manufacturer, int capacity, int numberofPropellers, String deep) {
        super(manufacturer, capacity);
        this.numberofPropellers = numberofPropellers;
        Deep = deep;
    }

    public int getNumberofPropellers() {
        return numberofPropellers;
    }

    public void setNumberofPropellers(int numberofPropellers) {
        this.numberofPropellers = numberofPropellers;
    }

    public String getDeep() {
        return Deep;
    }

    public void setDeep(String deep) {
        Deep = deep;
    }

@Override
    public void printVehicleDetails() {

        System.out.println(" Type: " + WaterVehicles.class.getName()+" Manufacturer: "+getManufacturer()+" Capacity: "+getCapacity() + " Number of Propellers: " + getNumberofPropellers() +
                " How deep can the boat go: " + getDeep());


    }

}