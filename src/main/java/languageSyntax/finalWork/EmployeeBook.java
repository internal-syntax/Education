package languageSyntax.finalWork;

import java.util.Arrays;

public class EmployeeBook {
    public static void main(String[] args) {
        Employee ivanov = new Employee("Иванов Иван Иванович", 1, 100_000);
        Employee petrov = new Employee("Петров Петр Петрович", 1, 55_000);
        Employee sidorov = new Employee("Сидоров Иван Иванович", 1, 65_000);
        Employee makarov = new Employee("Макаров Макар Макарович", 2, 70_000);
        Employee karavaev = new Employee("Караваев Александр Владимирович", 2, 75_000);

        Employee[] employees = {ivanov, petrov, sidorov, makarov, karavaev};

        printEmployee(employees);
        System.out.println();
        sumSalary(employees);
        minSalaryEmployee(employees);
        maxSalaryEmployee(employees);
        averageSalary(employees);
        fioEmployee(employees);
        salaryIndexation(employees, 10);
        minSalaryDepartment(employees, 2);
        maxSalaryDepartment(employees, 1);
        sumSalaryDepartment(employees, 2);
        avgSalaryDepartment(employees, 2);
        salaryIndexationDepartment(employees, 1, 10);
        printDepartmentEmploee(employees, 2);
        findMinSalaryEmployee(employees, 70_000);
        findMaxSalaryEmployee(employees, 90_000);
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
        System.out.printf("Сумма затрат на зарплаты в месяц = %,d%n", salarySum);
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

    public static void salaryIndexation(Employee[] employees, int indexationPercent) {
        int indexationSalary = 0;
        for (Employee emp : employees) {
            indexationSalary = ((emp.getSalary() * indexationPercent) / 100) + emp.getSalary();
            System.out.println("Проиндексированная зарплата сотрудника " + emp.getName() + " = " + indexationSalary);
        }
    }

    public static void minSalaryDepartment(Employee[] employees, int numberDepartment) {
        int minSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment && emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
            }
        }
        System.out.println("Минимальная зарплата в отделе №" + numberDepartment + " равна " + minSalary);
    }

    public static void maxSalaryDepartment(Employee[] employees, int numberDepartment) {
        int maxSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment && emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        System.out.println("Максимальная зарплата в отделе №" + numberDepartment + " равна " + maxSalary);
    }

    public static void sumSalaryDepartment(Employee[] employees, int numberDepartment) {
        int sumSalary = 0;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                sumSalary += emp.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц по отделу №" + numberDepartment + " = " + sumSalary);
    }

    public static void avgSalaryDepartment(Employee[] employees, int numberDepartment) {
        int sumEmployeeDepartment = 0;
        int sumSalaryDepartment = 0;
        int avgSalaryDepartment = 0;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                sumEmployeeDepartment++;
                sumSalaryDepartment += emp.getSalary();
            }
        }
        avgSalaryDepartment = sumSalaryDepartment / sumEmployeeDepartment;
        System.out.println("Средняя зарплата в отделе № " + numberDepartment + " = " + avgSalaryDepartment);
    }

    public static void salaryIndexationDepartment(Employee[] employees, int numberDepartment, int indexationPercent) {
        int indexationSalary = 0;
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                indexationSalary = ((emp.getSalary() * indexationPercent) / 100) + emp.getSalary();
                System.out.println("Проиндексированная зарплата сотрудника отдела №" + numberDepartment + " " + emp.getName() + " = " + indexationSalary);
            }
        }
    }

    public static void printDepartmentEmploee(Employee[] employees, int numberDepartment) {
        for (Employee emp : employees) {
            if (emp.getNumberDepartment() == numberDepartment) {
                System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            }
        }
    }

    public static void findMinSalaryEmployee(Employee[] employees, int salarySize) {
        for (Employee emp : employees) {
            if (emp.getSalary() < salarySize) {
                System.out.println("Сотрудник с зарплатой меньше " + salarySize + " : " + emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            }
        }
    }

    public static void findMaxSalaryEmployee(Employee[] employees, int salarySize) {
        for (Employee emp : employees) {
            if (emp.getSalary() > salarySize) {
                System.out.println("Сотрудник с зарплатой больше " + salarySize + " : " + emp.getId() + " " + emp.getName() + " " + emp.getSalary());
            }
        }
    }
}
