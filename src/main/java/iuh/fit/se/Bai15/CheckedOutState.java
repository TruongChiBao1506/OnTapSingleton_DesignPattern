package iuh.fit.se.Bai15;

public class CheckedOutState implements State{


    @Override
    public void borrow(Book book) {
        System.out.println("Book is already checked out");

    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book is returned");
        book.setState(new AvailableState());
    }

    @Override
    public void placeOnHold(Book book) {
        System.out.println("Book placed on hold while checked out.");
        book.setState(new OnHoldState());
    }

    @Override
    public void maskAsLost(Book book) {
        System.out.println("Book marked as lost.");
        book.setState(new LostState());
    }

    @Override
    public String toString() {
        return "CheckedOutState";
    }
}
