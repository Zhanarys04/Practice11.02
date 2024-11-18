import java.util.List;

public class Librarian {
    private CatalogInterface catalog;
    private AccountSystemInterface accountSystem;

    public Librarian(CatalogInterface catalog, AccountSystemInterface accountSystem) {
        this.catalog = catalog;
        this.accountSystem = accountSystem;
    }

    public void issueBook(Reader reader, String title) {
        List<Book> books = catalog.searchByTitle(title);
        if (!books.isEmpty()) {
            Book book = books.get(0);
            accountSystem.issueBook(reader, book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(Reader reader, String title) {
        List<Book> books = catalog.searchByTitle(title);
        if (!books.isEmpty()) {
            Book book = books.get(0);
            accountSystem.returnBook(reader, book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
