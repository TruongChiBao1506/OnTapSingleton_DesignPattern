package iuh.fit.se.Bai10;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new CreditCardStrategy("Nguyen Van A", "1234567890123456", "786", "12/15"));
        cart.pay(new PaypalStrategy("VanA@gamil.com","123456"));
    }
}
