/**
 * Created by Suwadith on 7/31/2017.
 */
public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }else if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("VAN")){
            return new Van();
        }else if(vehicleType.equalsIgnoreCase("MOTORBIKE")){
            return new Motorbike();
        }
        return null;
    }

}
