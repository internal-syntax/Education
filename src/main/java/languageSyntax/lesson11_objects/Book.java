package languageSyntax.lesson11_objects;

public class Book {
    private Author author;
    private String nameBook;
    private int yearPublication;

    public Book(Author author, String nameBook, int yearPublication) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
