package languageSyntax;

//Урок 2. Переменные
public class Lesson2_Variables {
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
        byte var1 = 127;
        System.out.println("Значение переменной var1 с типом byte равно " + var1);
        short var2 = 1000;
        System.out.println("Значение переменной var2 с типом short равно " + var2);
        int var3 = 1000000;
        System.out.println("Значение переменной var3 с типом int равно " + var3);
        long var4 = 10000000;
        System.out.println("Значение переменной var4 с типом long равно " + var4);
        float var5 = 100.50F;
        System.out.println("Значение переменной var5 с типом float равно " + var5);
        double var6 = 500.456465132;
        System.out.println("Значение переменной var1 с типом double равно " + var6);

        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        float var1 = 27.12f;
        System.out.println("var1 = " + var1);
        long var2 = 987678965549L;
        System.out.println("var2 = " + var2);
        double var3 = 2.786;
        System.out.println("var3 = " + var3);
        short var4 = 569;
        System.out.println("var4 = " + var4);
        short var5 = -159;
        System.out.println("var5 = " + var5);
        short var6 = 27897;
        System.out.println("var6 = " + var6);
        byte var7 = 67;
        System.out.println("var7 = " + var7);

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short sheet = 480;
        int totalStudents = lP + aS + eA;
        System.out.println("Всего учеников = " + totalStudents);
        int forEach = sheet / totalStudents;
        System.out.println("Листов на каждого = " + forEach);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Производительность машины для изготовления бутылок — 8 бутылок за 1 минуту
        int machinePerformanceMin = 8;
        System.out.println("Производительность машины в минуту " + machinePerformanceMin);
        int min20 = machinePerformanceMin * 20;
        System.out.println("Производительность машины за 20 минут " + min20);
        int day = ((machinePerformanceMin * 60) * 24) * 8;
        System.out.println("Производительность машины в сутки " + day);
        int performance3Day = day * 3;
        System.out.println("Производительность машины за 3 дня " + performance3Day);
        int performance30Days = day * 30;
        System.out.println("Производительность машины за 30 дней  = " + performance30Days);

        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
/*      На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.*/
        // Вычисляем количество классов
        var numberOfClasses = 120 / 6;
        System.out.println("Количество классов = " + numberOfClasses);
        var whitePaint = numberOfClasses * 2;
        System.out.println("Количество банок белой краски " + whitePaint);
        var brownPaint = numberOfClasses * 4;
        System.out.println("Количество банок коричневой краски " + brownPaint);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
/*      Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.*/
        int breakfastWeight = (5 * 80) + (105 * 2) + (100 * 2) + (70 * 4);
        System.out.println("Вес завтрака в граммах = " + breakfastWeight);
        float breakfastWeightKg = (float) breakfastWeight / 1000;
        System.out.println("Вес завтрака в килограммах = " + breakfastWeightKg);

        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
/*      Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.*/
        double weightLoss250 = (7 * 1000) / 250;
        System.out.println("Количетсво дней если терять по 250г в день = " + weightLoss250);
        double weightLoss500 = (7 * 1000) / 500;
        System.out.println("Количетсво дней если терять по 500г в день =  = " + weightLoss500);

        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
/*      Маша получает 67760 рублей в месяц.
        Денис получает 83690 рублей в месяц.
        Кристина получает 76230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».*/
        double mSalary = 67760;
        double mSalaryUp10Percent = ((mSalary * 10) / 100) + mSalary;
        System.out.println("Зарплата Миши после повышения на 10% = " + mSalaryUp10Percent);
        double dSalary = 83690;
        double dSalaryUp10Percent = ((dSalary * 10) / 100) + dSalary;
        System.out.println("Зарплата Дениса после повышения на 10% = " + dSalaryUp10Percent);
        double kSalary = 76230;
        double kSalaryUp10Percent = ((kSalary * 10) / 100) + kSalary;
        System.out.println("Зарплата Кристины после повышения на 10% = " + kSalaryUp10Percent);
        double mDifferenceInAnnualIncome = (mSalaryUp10Percent * 12) - (mSalary * 12);
        System.out.println("Маша теперь получает " + mSalaryUp10Percent + " рублей. Годовой доход вырос на " + mDifferenceInAnnualIncome + " рублей»");
        double dDifferenceInAnnualIncome = (dSalaryUp10Percent * 12) - (dSalary * 12);
        System.out.println("Денис теперь получает " + dSalaryUp10Percent + " рублей. Годовой доход вырос на " + dDifferenceInAnnualIncome + " рублей»");
        double kDifferenceInAnnualIncome = (kSalaryUp10Percent * 12) - (kSalary * 12);
        System.out.println("Кристина теперь получает " + kSalaryUp10Percent + " рублей. Годовой доход вырос на " + kDifferenceInAnnualIncome + " рублей»");

        System.out.println();
    }
}
