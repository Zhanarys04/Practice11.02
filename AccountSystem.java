import java.util.HashMap;
import java.util.Map;

public class AccountSystem implements AccountSystemInterface {
    private Map<Reader, Book> issuedBooks;

    public AccountSystem() {
        this.issuedBooks = new HashMap<>();
    }

    @Override
    public void issueBook(Reader reader, Book book) {
        issuedBooks.put(reader, book);
        System.out.println("Book issued: " + book + " to " + reader);
    }

    @Override
    public void returnBook(Reader reader, Book book) {
        if (issuedBooks.containsKey(reader) && issuedBooks.get(reader).equals(book)) {
            issuedBooks.remove(reader);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Error: Book not issued to this reader.");
        }
    }

    @Override
    public void showIssuedBooks() {
        for (Map.Entry<Reader, Book> entry : issuedBooks.entrySet()) {
            System.out.println(entry.getKey() + " has borrowed " + entry.getValue());
        }
    }
}
