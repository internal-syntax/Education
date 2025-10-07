package languageSyntax;

//Урок 6. Циклы
public class Lesson6_Cycles {
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
        int startSum = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + startSum;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start++ + " ");
        }
        System.out.println();
        start = 1;
        for (int i = 10; i != 0; i = i - start) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = (population / 1000) * 17;
        System.out.println("birth = " + birth);
        int mortality = (population / 1000) * 8;
        System.out.println("mortality = " + mortality);
        int year = 0;
        while (year <= 10) {
            year++;
            population = (population + birth) - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        double deposit = 15_000;
        double target = 12_000_000;
        double percent = 0.07;
        int month = 0;
        while (deposit < target) {
            deposit += deposit * percent;
            month++;
            System.out.println("Месяц " + month + " сумма " + (long) deposit);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15_000;
        double target = 12_000_000;
        double percent = 0.07;
        int month = 0;
        while (deposit < target) {
            deposit += deposit * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма " + (long) deposit);
            }
        }
        System.out.println("Итого " + (long) deposit);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        double deposit = 15_000;
        int beginningSavings = 0;
        int endSavings = 9 * 12;
        double percent = 0.07;
        while (beginningSavings < endSavings) {
            deposit += deposit * percent;
            beginningSavings++;
            if (beginningSavings % 6 == 0) {
                System.out.println("Месяц " + beginningSavings + " сумма " + (long) deposit);
            }
        }
        System.out.println("Итого " + (long) deposit);
        System.out.println();
        System.out.println("Задача 6 через for");
        double startSum = 15_000;
        for (int i = 1; i <= 9 * 12; i++) {
            startSum += startSum * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма " + (long) startSum);
            }
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 5; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 1825;
        for (int i = 0; i <= 2125; i += 79) {
            if (i >= startYear) {
                System.out.println(i);
            }
        }
    }

}
