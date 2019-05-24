public class Vehicles {

    private String Manufacturer;
    private int Capacity;





    Vehicles(String manufacturer, int capacity) {
        this.Manufacturer = manufacturer;
        this.Capacity = capacity;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {

        Capacity = capacity;

    }
    void printVehicleDetails(){

        System.out.println("Manufacturer: "+getManufacturer()+"Capacity: "+getCapacity());

    }

}










