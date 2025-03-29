package iuh.fit.se.Bai12;

public class Main {
    public static void main(String[] args) {

        // Tạo một chiếc pizza cơ bản
        Pizza basicPizza = new PlainPizza();
        System.out.println("Description: " + basicPizza.getDescription());
        System.out.println("Cost: $" + basicPizza.getCost());

        // Thêm phô mai
        Pizza cheesePizza = new CheeseTopping(basicPizza);
        System.out.println("\nDescription: " + cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.getCost());

        // Thêm phô mai và pepperoni
        Pizza cheesePepperoniPizza = new PepperoniTopping(cheesePizza);
        System.out.println("\nDescription: " + cheesePepperoniPizza.getDescription());
        System.out.println("Cost: $" + cheesePepperoniPizza.getCost());

        // Thêm phô mai, pepperoni và rau củ
        Pizza fullyLoadedPizza = new VeggieTopping(cheesePepperoniPizza);
        System.out.println("\nDescription: " + fullyLoadedPizza.getDescription());
        System.out.println("Cost: $" + fullyLoadedPizza.getCost());
    }
}
