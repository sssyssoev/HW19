
public class Book {
    private String bookName;
    private Author bookAuth;
    private int bookYear;

    public Book(String book, Author bookAuthor, int pubYear) {
        this.bookName = book;
        this.bookAuth = bookAuthor;
        this.bookYear = pubYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuth() {
        return bookAuth;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

}
