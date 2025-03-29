package iuh.fit.se.Bai15;

public class OnHoldState implements State{


    @Override
    public void borrow(Book book) {
        System.out.println("Book borrowed successfully.");
        book.setState(new CheckedOutState());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book is already returned.");
        book.setState(new ReturnedState());
    }

    @Override
    public void placeOnHold(Book book) {
        System.out.println("Book is already on hold.");

    }

    @Override
    public void maskAsLost(Book book) {
        System.out.println("Book marked as lost.");
        book.setState(new LostState());
    }

    @Override
    public String toString() {

        return "OnHoldState";
    }
}
