package delta;

public class VehicleFactory {
    public  Vehicle getvehicle ( String vehicletype){


        if(vehicletype==null){
            return null;
        } else if (vehicletype.equalsIgnoreCase("CAR")) {
            return  new Car();
            
        } else if (vehicletype.equalsIgnoreCase("Truck")) {
            return  new Truck();

        } else if (vehicletype.equalsIgnoreCase("Motorcycle")) {
            return  new Motorcycle();

        }
        return null;
    }
}
