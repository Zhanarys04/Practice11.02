public class LibraryManagementSystem {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        AccountSystem accountSystem = new AccountSystem();
        Librarian librarian = new Librarian(catalog, accountSystem);

        catalog.addBook(new Book("1984", "George Orwell", "Dystopian", "1234567890"));
        catalog.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "0987654321"));

        Reader reader = new Reader("John", "Doe", "A123");

        librarian.issueBook(reader, "1984");

        accountSystem.showIssuedBooks();

        librarian.returnBook(reader, "1984");

        accountSystem.showIssuedBooks();
    }
}
