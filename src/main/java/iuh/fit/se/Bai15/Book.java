package iuh.fit.se.Bai15;

public class Book {
    private State state;

    public Book() {
        this.state = new AvailableState();
    }
    public void setState(State tvState) {
        this.state = tvState;
    }
    public State getState() {
        return state;
    }

    public void borrow() {
        state.borrow(this);
    }

    public void returnBook() {
        state.returnBook(this);
    }
    public void placeOnHold() {
        state.placeOnHold(this);
    }
    public void maskAsLost() {
        state.maskAsLost(this);
    }


    @Override
    public String toString() {
        return "Book [State=" + state + "]";
    }
}
