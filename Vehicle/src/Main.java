public class Main {

    public static void main(String[] args) {

       LandVehicles car = new LandVehicles("Mercedes Benz",4,4,"Petrol","Private Use");
       car.printVehicleDetails();

       WaterVehicles boat = new WaterVehicles("FerryLtd",60,4,"Lake");
       boat.printVehicleDetails();

       AirVehicle plane = new AirVehicle("Boeing",100,4,"Passenger Plane");
       plane.printVehicleDetails();


    }
}
