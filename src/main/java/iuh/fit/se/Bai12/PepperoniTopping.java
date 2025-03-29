package iuh.fit.se.Bai12;

public class PepperoniTopping extends PizzaDecorator{
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
