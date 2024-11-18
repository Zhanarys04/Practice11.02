import java.util.List;

public interface CatalogInterface {
    void addBook(Book book);
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    List<Book> searchByGenre(String genre);
}
