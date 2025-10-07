package languageSyntax;

//Урок 1. Переменные
public class Lesson1_Variables {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog + 4.0);
        var cat = 3.6;
        System.out.println(cat + 4);
        var paper = 763789;
        System.out.println(paper + 4);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog - 3.5);
        var cat = 3.6;
        System.out.println(cat + 1.6);
        var paper = 763789;
        System.out.println(paper + 7639);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstFighter = 78.2;
        System.out.println("Вес первого боксёра = " + firstFighter);
        var twoFighter = 82.7;
        System.out.println("Вес второго боксёра = " + twoFighter);
        var totalWeight = firstFighter + twoFighter;
        System.out.println("Общий вес двух бойцов = " + totalWeight);
        var weightDifference = twoFighter - firstFighter;
        System.out.println("Разница веса бойцов = " + weightDifference);
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstFighter = 78.2;
        System.out.println("Вес первого боксёра = " + firstFighter);
        var twoFighter = 82.7;
        System.out.println("Вес второго боксёра = " + twoFighter);
        var weightDifference = twoFighter - firstFighter;
        System.out.println("Разница веса бойцов = " + weightDifference);
        var weightDifference2 = twoFighter % firstFighter;
        System.out.println("Разница веса бойцов = " + weightDifference2);
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        var timeWork = 640;
        var numberOfEmployees = timeWork / 8;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        System.out.println("Если на 94 человека больше " + numberOfEmployees);
        var if94EmMore = numberOfEmployees * 8;
        System.out.println("Если на 94 человека больше то = " + if94EmMore + " часов");
    }
}