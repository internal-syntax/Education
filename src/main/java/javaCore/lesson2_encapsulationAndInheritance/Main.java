package javaCore.lesson2_encapsulationAndInheritance;

public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 90, 30, 20, 40);
        Gryffindor germyona = new Gryffindor("Гермиона Грейнджер", 95, 100, 40, 30, 35);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 80, 30, 18, 30);

        Slytherin draco = new Slytherin("Драко Малфой", 80, 90, 40, 80, 90);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 50, 50, 35, 55, 30);
        Slytherin gragory = new Slytherin("Грегори Гойл", 40, 40, 32, 50, 40);

        Hufflepuff zakharya = new Hufflepuff("Захария Смит", 30, 50, 32, 40, 35);
        Hufflepuff cedryk = new Hufflepuff("Седрик Диггори", 40, 60, 32, 40, 35);
        Hufflepuff jastin = new Hufflepuff("Джастин Финч - Флетчли", 30, 50, 32, 40, 35);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 40, 60, 50, 40, 35);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 35, 40, 40, 50, 40);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 50, 52, 48, 36, 33);

        harry.studentDescription();
        harry.comparisonByFaculty(ron);
        germyona.comparisonByFaculty(ron);
        gragory.studentComparison(draco);
    }
}
