import library.Library;
import library.book.Book;
import library.factory.BookFactory;
import library.strategy.AuthorSearchStrategy;
import library.strategy.SearchStrategy;
import library.strategy.TitleSearchStrategy;
import library.user.Librarian;
import library.user.Member;
import library.user.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Singleton Library instance
        Library library = Library.getInstance();

        // Add books using the Factory Pattern
        library.addBook(BookFactory.createBook("novel", "Pride and Prejudice", "Jane Austen"));
        library.addBook(BookFactory.createBook("reference", "Java Programming", "James Gosling"));

        // Create search strategies
        SearchStrategy titleSearch = new TitleSearchStrategy();
        SearchStrategy authorSearch = new AuthorSearchStrategy();

        // Search for a book by title
        List<Book> titleResults = titleSearch.search(library.getBooks(), "Pride and Prejudice");
        System.out.println("Books found by title: " + titleResults.size());

        // Search for a book by author
        List<Book> authorResults = authorSearch.search(library.getBooks(), "Jane Austen");
        System.out.println("Books found by author: " + authorResults.size());

        // Demonstrate User roles
        User member = new Member("Alice");
        User librarian = new Librarian("Bob");

        member.performRole();
        librarian.performRole();
    }
}
