package iuh.fit.se.Bai5;

public class FamilyCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new FamilyCar();
    }

    @Override
    public Engine installEngine() {
        return new V6Engine();
    }
}
