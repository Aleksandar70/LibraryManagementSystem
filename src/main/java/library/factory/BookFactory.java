package library.factory;

import library.book.Book;
import library.book.Novel;
import library.book.ReferenceBook;

public class BookFactory {
    public static Book createBook(String type, String title, String author) {
        switch (type.toLowerCase()) {
            case "novel":
                return new Novel(title, author);
            case "reference":
                return new ReferenceBook(title, author);
            default:
                throw new IllegalArgumentException("Unknown book type");
        }
    }
}
