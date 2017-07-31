/**
 * Created by Suwadith on 7/31/2017.
 */
public class FactoryPatternDemo {

    public static void main(String[] args){

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle("car");

        vehicle1.accelerate();

        Vehicle vehicle2 = vehicleFactory.getVehicle("van");

        vehicle2.accelerate();

        Vehicle vehicle3 = vehicleFactory.getVehicle("motorbike");

        vehicle3.accelerate();

    }

}
