package languageSyntax.lesson11_objects;

import java.util.Objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstNameAuthor='" + firstNameAuthor + '\'' +
                ", lastNameAuthor='" + lastNameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(lastNameAuthor, author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, lastNameAuthor);
    }
}
