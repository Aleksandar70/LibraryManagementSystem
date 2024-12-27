package library.strategy;// library.strategy.SearchStrategy.java

import library.book.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String query);
}
