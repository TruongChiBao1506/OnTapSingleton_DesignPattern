package iuh.fit.se.Bai20;

public class Main {
    public static void main(String[] args) {

        Cake cake = new PlainCake();
        System.out.println(cake.getDescription() + " $" + cake.getCost());
        Cake cakeWithChocolate = new ChocolateTopping(new PlainCake());
        System.out.println(cakeWithChocolate.getDescription() + " $" + cakeWithChocolate.getCost());
        Cake cakeWithChocolateAndFruit = new FruitTopping(new ChocolateTopping(new PlainCake()));
        System.out.println(cakeWithChocolateAndFruit.getDescription() + " $" + cakeWithChocolateAndFruit.getCost());
        Cake cakeWithChocolateAndFruitAndCream = new CreamTopping(new FruitTopping(new ChocolateTopping(new PlainCake())));
        System.out.println(cakeWithChocolateAndFruitAndCream.getDescription() + " $" + cakeWithChocolateAndFruitAndCream.getCost());
    }
}
