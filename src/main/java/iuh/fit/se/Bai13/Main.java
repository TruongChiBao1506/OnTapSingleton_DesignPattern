package iuh.fit.se.Bai13;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());

        Beverage tea = new Tea();
        System.out.println(tea.getDescription() + " costs " + tea.getCost());
        System.out.println(tea.getDescription() + " costs " + tea.getCost());

        Beverage coffeeWithWhippedCream = new WhippedCreamDecorator(new Coffee());
        System.out.println(coffeeWithWhippedCream.getDescription() + " costs " + coffeeWithWhippedCream.getCost());

        Beverage teaWithWhippedCream = new WhippedCreamDecorator(new Tea());
        System.out.println(teaWithWhippedCream.getDescription() + " costs " + teaWithWhippedCream.getCost());

        Beverage coffeeWithMilk = new MilkDecorator(new Coffee());
        System.out.println(coffeeWithMilk.getDescription() + " costs " + coffeeWithMilk.getCost());

        Beverage teaWithMilk = new MilkDecorator(new Tea());
        System.out.println(teaWithMilk.getDescription() + " costs " + teaWithMilk.getCost());

        Beverage coffeeWithWhippedCreamAndMilk = new MilkDecorator(new WhippedCreamDecorator(new Coffee()));
        System.out.println(coffeeWithWhippedCreamAndMilk.getDescription() + " costs " + coffeeWithWhippedCreamAndMilk.getCost());

        Beverage teaWithWhippedCreamAndMilk = new MilkDecorator(new WhippedCreamDecorator(new Tea()));
        System.out.println(teaWithWhippedCreamAndMilk.getDescription() + " costs " + teaWithWhippedCreamAndMilk.getCost());
    }
}
