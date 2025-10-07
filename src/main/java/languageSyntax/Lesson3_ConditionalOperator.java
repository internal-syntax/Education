package languageSyntax;

//Урок 3. Условный оператор
public class Lesson3_ConditionalOperator {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        short age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        short temperature = 10;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч можно ездить спокойно");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        short age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить  работу");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        short age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        short numberOfPassengers = 30;
        if (numberOfPassengers <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberOfPassengers > 60 && numberOfPassengers <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 5;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " больше");
        } else if (one == two && two == three) {
            System.out.println("Числа равны");
        }
    }
}
