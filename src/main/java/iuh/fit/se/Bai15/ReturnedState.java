package iuh.fit.se.Bai15;

public class ReturnedState implements State{


    @Override
    public void borrow(Book book) {
        System.out.println("Book borrowed successfully.");
        book.setState(new CheckedOutState());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book is already returned.");

    }

    @Override
    public void placeOnHold(Book book) {
        System.out.println("Book placed on hold.");
        book.setState(new OnHoldState());
    }

    @Override
    public void maskAsLost(Book book) {
        System.out.println("Book marked as lost.");
        book.setState(new LostState());
    }

    @Override
    public String toString() {
        return "ReturnedState";
    }
}
