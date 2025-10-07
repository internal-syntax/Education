package languageSyntax;

import java.util.Arrays;

//Урок 7. Массивы
public class Lesson7_Arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers2 = " + numbers2[i]);
        }
        System.out.println();
        String[] words = {"один", "два", "три"};
        for (int i = 0; i < words.length; i++) {
            System.out.println("words = " + words[i]);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        String[] words = {"один", "два", "три"};
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        String[] words = {"один", "два", "три"};
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
