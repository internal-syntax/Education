package languageSyntax.lesson11_objects;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getLastNameAuthor() {
        return lastNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
    }
}
