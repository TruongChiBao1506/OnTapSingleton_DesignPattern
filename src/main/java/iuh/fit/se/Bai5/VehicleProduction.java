package iuh.fit.se.Bai5;

public class VehicleProduction {
    public static void productVehicle(CarFactory carFactory) {
        Car car = carFactory.createCar();
        Engine engine = carFactory.installEngine();

        car.assemble();
        engine.install();
    }
}
