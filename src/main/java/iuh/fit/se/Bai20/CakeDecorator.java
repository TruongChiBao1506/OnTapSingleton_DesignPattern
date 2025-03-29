package iuh.fit.se.Bai20;

public class CakeDecorator implements Cake{
    protected Cake cake;
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }
    @Override
    public String getDescription() {
        return cake.getDescription();
    }

    @Override
    public double getCost() {
        return cake.getCost();
    }
}
