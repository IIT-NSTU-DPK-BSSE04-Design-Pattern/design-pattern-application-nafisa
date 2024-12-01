package delta;

public class main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vcar = vehicleFactory.getvehicle("CAR");
        vcar.system();

        Vehicle vtruck = vehicleFactory.getvehicle("Truck");
        vtruck.system();

        Vehicle vmotorcycle = vehicleFactory.getvehicle("Motorcycle");
        vmotorcycle.system();







    }
}
