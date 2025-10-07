package languageSyntax;

import java.util.Arrays;

// Урок 8. Массивы
public class Lesson8_Arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int arr[] = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int arr[] = generateRandomArray();
        int maxSpending = 0;
        int minSpending = 200_000;
        for (int i : arr) {
            if (i > maxSpending) {
                maxSpending = i;
            }
            if (i < minSpending) {
                minSpending = i;
            }
            System.out.println(i);
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int arr[] = generateRandomArray();
        double averageWaste = 0;
        for (int i : arr) {
            System.out.println(i);
            averageWaste = averageWaste + (double) i / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageWaste + " рублей");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
