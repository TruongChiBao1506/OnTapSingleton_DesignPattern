package iuh.fit.se.Bai20;

public class CreamTopping extends CakeDecorator{

    public CreamTopping(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with cream topping ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}
