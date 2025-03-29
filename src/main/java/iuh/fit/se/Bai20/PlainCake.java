package iuh.fit.se.Bai20;

public class PlainCake implements Cake{

    @Override
    public String getDescription() {
        return "Plain Cake";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
