public interface AccountSystemInterface {
    void issueBook(Reader reader, Book book);
    void returnBook(Reader reader, Book book);
    void showIssuedBooks();
}
