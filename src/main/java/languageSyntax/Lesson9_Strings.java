package languageSyntax;

//Урок 9. Строки
public class Lesson9_Strings {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        String lastName = "Ivanov ";
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }
}
