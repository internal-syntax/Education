package languageSyntax;

import java.time.LocalDate;

//Урок 10. Методы
public class lesson10_methods {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkingTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkingTheDevice(byte OS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0 && year <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 0 && year == currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (OS == 1 && year <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 1 && year == currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static void checkingNumberDays(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int yaer = 2012;
        checkingTheYear(yaer);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        checkingTheDevice((byte) 1, 2024);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        checkingNumberDays(120);
    }
}
