package library.book;

public class Novel implements Book {

    private String title;
    private String author;

    public Novel(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}