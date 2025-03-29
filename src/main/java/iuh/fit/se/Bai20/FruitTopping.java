package iuh.fit.se.Bai20;

public class FruitTopping extends CakeDecorator{

    public FruitTopping(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with fruit topping";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
