package iuh.fit.se.Bai15;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();


        System.out.println(book); // Book [State=Available]

        // Mượn sách
        book.borrow();
        System.out.println(book); // Book [State=Checked Out]

        // Đặt chỗ khi sách đang được mượn
        book.placeOnHold();
        System.out.println(book); // Book [State=On Hold]

        // Trả sách
        book.returnBook();
        System.out.println(book); // Book [State=On Hold]

        // Đánh dấu sách bị mất
        book.maskAsLost();
        System.out.println(book); // Book [State=Lost]

        // Thử mượn sách khi đã mất
        book.borrow();
    }
}
