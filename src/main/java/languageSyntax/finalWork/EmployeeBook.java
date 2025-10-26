package languageSyntax.finalWork;

import java.util.Arrays;

public class EmployeeBook {
    public static void main(String[] args) {
        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 100_000);
        Employee petrov = new Employee("Петров Петр Петрович", 2, 65_000);
        Employee sidorov = new Employee("Сидоров Иван Иванович", 3, 65_000);
        Employee makarov = new Employee("Макаров Макар Макарович", 4, 70_000);
        Employee karavaev = new Employee("Караваев Александр Владимирович", 5, 75_000);

        Employee[] employees = {ivanov, petrov, sidorov, makarov, karavaev};

        printEmployee(employees);
        System.out.println();
        sumSalary(employees);
        minSalaryEmployee(employees);
        maxSalaryEmployee(employees);
        averageSalary(employees);
        fioEmployee(employees);
    }

    public static void printEmployee(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static void sumSalary(Employee[] employees) {
        int salarySum = 0;
        for (Employee emp : employees) {
            salarySum += emp.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + salarySum);
    }

    public static void minSalaryEmployee(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
            }
        }
        System.out.println("Минимальная зарплата = " + minSalary);
    }

    public static void maxSalaryEmployee(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        System.out.println("Максимальная зарплата = " + maxSalary);
    }

    public static void averageSalary(Employee[] employees) {
        int salarySum = 0;
        int avgSalary = 0;
        for (Employee emp : employees) {
            salarySum += emp.getSalary();
            avgSalary = salarySum / employees.length;
        }
        System.out.println("Средняя зарплата = " + avgSalary);
    }

    public static void fioEmployee(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }
}
