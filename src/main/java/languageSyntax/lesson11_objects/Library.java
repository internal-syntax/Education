package languageSyntax.lesson11_objects;

//Урок 11. Объекты и классы
public class Library {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Федор", "Достоевский");
        Book warAndPeace = new Book(tolstoy, "Война и мир", 2005);
        Book crimeAndPunishment = new Book(dostoevsky, "Преступление и наказание", 2008);
        System.out.println(tolstoy.getFirstNameAuthor() + " " + tolstoy.getLastNameAuthor() + " - " + warAndPeace.getNameBook() + " " + warAndPeace.getYearPublication());
        warAndPeace.setYearPublication(2010);
        System.out.println(tolstoy.getFirstNameAuthor() + " " + tolstoy.getLastNameAuthor() + " - " + warAndPeace.getNameBook() + " " + warAndPeace.getYearPublication());
    }
}
