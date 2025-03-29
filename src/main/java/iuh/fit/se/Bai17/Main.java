package iuh.fit.se.Bai17;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.getVehicle("CAR");
        car.drive();
        Vehicle bycicle = factory.getVehicle("BICYCLE");
        bycicle.drive();

        Vehicle motorcycle = factory.getVehicle("MOTOCYCLE");
        motorcycle.drive();
    }
}
