package iuh.fit.se.Bai5;

public class ElectricCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Engine installEngine() {
        return new ElectricEngine();
    }
}
