package iuh.fit.se.Bai13;

public class MilkDecorator extends BeverageDecorator{

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
