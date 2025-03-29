package iuh.fit.se.Bai12;

public class VeggieTopping extends PizzaDecorator{

    public VeggieTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Veggies";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}
