package languageSyntax;

//Урок 4. Условный оператор
public class Lesson4_ConditionalOperator {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int yearOfIssue = 2014;
        if (clientOS == 1 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearOfIssue > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearOfIssue > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 120;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
