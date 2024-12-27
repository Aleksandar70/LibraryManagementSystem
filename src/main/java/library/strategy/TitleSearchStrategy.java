package library.strategy;

import library.book.Book;

import java.util.ArrayList;
import java.util.List;

public class TitleSearchStrategy implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }

        return result;
    }
}