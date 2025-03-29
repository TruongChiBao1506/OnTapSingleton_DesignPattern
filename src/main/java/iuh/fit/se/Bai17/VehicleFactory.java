package iuh.fit.se.Bai17;

public class VehicleFactory {
    public VehicleFactory() {
        System.out.println("VehicleFactory created!");
    }
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("MOTOCYCLE")) {
            return new Motorcycle();
        } else if (vehicleType.equalsIgnoreCase("BICYCLE")) {
            return new Bicycle();
        }
        return null;
    }
}
