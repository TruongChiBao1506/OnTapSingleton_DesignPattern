package iuh.fit.se.Bai12;

public class CheeseTopping extends PizzaDecorator{
    public CheeseTopping(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
