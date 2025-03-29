package iuh.fit.se.Bai15;

public interface State {
    public void borrow(Book book);
    public void returnBook(Book book);
    public void placeOnHold(Book book);
    public void maskAsLost(Book book);
}
