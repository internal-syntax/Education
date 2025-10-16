package languageSyntax.lesson11_objects;

import java.util.Objects;

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
        return this.author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication < 0) {
            throw new IllegalArgumentException("Год издания не может быть отрицательным");
        }
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", nameBook='" + nameBook + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(author, book.author) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, yearPublication);
    }
}
