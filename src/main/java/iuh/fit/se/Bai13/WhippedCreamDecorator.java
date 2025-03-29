package iuh.fit.se.Bai13;

public class WhippedCreamDecorator extends BeverageDecorator{

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whipped Cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.5;
    }
}
