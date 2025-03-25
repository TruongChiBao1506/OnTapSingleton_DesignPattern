package iuh.fit.se.Bai5;

public class SportsCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new SportsCar();
    }

    @Override
    public Engine installEngine() {
        return new V8Engine();
    }
}
