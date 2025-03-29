package iuh.fit.se.Bai20;

public class ChocolateTopping extends CakeDecorator{

    public ChocolateTopping(Cake cake) {
        super(cake);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", Chocolate Topping";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
