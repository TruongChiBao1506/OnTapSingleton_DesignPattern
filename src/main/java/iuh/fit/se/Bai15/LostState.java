package iuh.fit.se.Bai15;

public class LostState implements State{


    @Override
    public void borrow(Book book) {
        System.out.println("Book is lost.");

    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book is lost.");
    }

    @Override
    public void placeOnHold(Book book) {
        System.out.println("Book is lost.");
    }

    @Override
    public void maskAsLost(Book book) {
        System.out.println("Book is lost.");
    }

    @Override
    public String toString() {
        return "LostState";
    }
}
