package iuh.fit.se.Bai13;

public class SugarDecorator extends BeverageDecorator{

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.25;
    }
}
